class Solution {
    public String reverseVowels(String s) {
        int n=s.length();
        List<Character>h=new ArrayList<>();
        char ch[]=s.toCharArray();
        for(int i=0;i<n;i++)
        {
            if("AEIOUaeiou".indexOf(ch[i])!=-1)
            {
            h.add(ch[i]);
            }
        }
        if(h.size()==0)
        return new String(ch);
        int j=h.size()-1;
        for(int i=0;i<n;i++)
        {
            if("AEIOUaeiou".indexOf(ch[i])!=-1)
            ch[i]=h.get(j--);
        }
        return new String(ch);
        
    }
}
