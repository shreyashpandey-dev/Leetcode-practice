
class Solution {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) 
    {
        HashSet<String>h=new HashSet<>(wordList);
        Queue<String> q=new ArrayDeque<>();
        Map<String,Integer>level=new HashMap<>();
        level.put(beginWord,1);
        q.add(beginWord);
        Map<String,List<String>>parents=new HashMap<>();
        List<List<String>>ans=new ArrayList<>();
        while(!q.isEmpty())
        {
            String currWord=q.poll();
            int currLevel=level.get(currWord);
            for(int i=0;i<currWord.length();i++)
            {
                char[] charArr=currWord.toCharArray();
                for(char ch='a';ch<='z';ch++)
                {
                    char original=charArr[i];
                    charArr[i]=ch;
                    String newW=new String(charArr);
                    if(!h.contains(newW))
                    continue;
                        //two cases , i)pehli baar ya 2) kisi aur barr
                    if(!level.containsKey(newW))
                        {
                            q.offer(newW);
                            level.put(newW,currLevel+1);
                            parents.putIfAbsent(newW,new ArrayList<>());
                            parents.get(newW).add(currWord);

                        }
                    else if(level.get(newW)==currLevel+1)
                        parents.get(newW).add(currWord);
                    
                    charArr[i]=original;
                    }

                }

            }
        //agar word nhi bana last tk
        if(!level.containsKey(endWord))
        return ans;
        List<String> path=new ArrayList<>();
        path.add(endWord);
        dfs(endWord,beginWord,ans,path,parents);
        return ans;
        
    }
    void dfs(String beginW,String endW,List<List<String>>ans,List<String> path,Map<String,List<String>>parents)
    {
        if(beginW.equals(endW))
        {
            List<String>temp=new ArrayList<>(path);
            Collections.reverse(temp);
            ans.add(temp);
            return;

        }
        if(parents.containsKey(beginW))
        {
        for(String par : parents.get(beginW))
        {
            path.add(par);
            dfs(par,endW,ans,path,parents);
            path.remove(path.size()-1);
        }
        }
    }
}
