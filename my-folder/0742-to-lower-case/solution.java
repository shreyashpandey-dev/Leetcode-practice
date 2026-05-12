class Solution {
    public String toLowerCase(String s) {
        char ch[]=s.toCharArray();
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            if(ch[i]>=65 && ch[i]<=90)
            ch[i]=(char)(ch[i]+32);
        }
        return new String(ch);

        
    }
}
