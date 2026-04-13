class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();
        char ch[]=new char[n];
        int i=0;
        for(char c:s.toCharArray())
        {
            if(c>='A' && c<='Z')
            {
            c=(char)(c+32);
            ch[i++]=c;
            }
            else if( c>='a' && c<='z')
            ch[i++]=c;
            else if( c>='0' && c<='9')
            ch[i++]=c;
        }
        int p=0;
        int q=i-1;
        while(p<q)
        {
            if(ch[p]!=ch[q])
               return false;
            p++;
            q--;
        }
        return true;
        
    }
}
