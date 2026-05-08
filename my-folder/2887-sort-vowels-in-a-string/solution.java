class Solution {
    public String sortVowels(String s) {
        int n=s.length();
        List<Character>h=new ArrayList<>();
        char ch[]=s.toCharArray();
        for(int i=0;i<n;i++)
        {
            if("AEIOUaeiou".indexOf(ch[i])!=-1)
            {
            h.add(ch[i]);
            ch[i]=',';
            }
        }
        Collections.sort(h);
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(ch[i]==',')
            ch[i]=h.get(j++);
        }
        return new String(ch);
        
        
    }
}
