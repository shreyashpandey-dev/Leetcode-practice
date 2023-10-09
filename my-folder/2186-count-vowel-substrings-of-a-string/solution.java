class Solution {
    public int countVowelSubstrings(String s) {
        int n=s.length();
        if(n<5)
        return 0;
        int ans=0;
        for(int i=0;i<=n-5;i++)
        {
            //String t="";
            int check[]=new int[5];
            if("aeiou".contains(String.valueOf(s.charAt(i)))==false)
            continue;
            for(int j=i;j<n;j++)
            {
                if("aeiou".contains(String.valueOf(s.charAt(j))))
                {
                    if(s.charAt(j)=='a')
                    check[0]++;
                    else if(s.charAt(j)=='e')
                    check[1]++;
                    else if(s.charAt(j)=='i')
                    check[2]++;
                    else if(s.charAt(j)=='o')
                    check[3]++;
                    else if(s.charAt(j)=='u')
                    check[4]++;
                    if(j-i+1>=5)
                    {
                        if(check[0]>=1 && check[1]>=1 && check[2]>=1&& check[3]>=1 && check[4]>=1)
                        ans++;
                    }
                }
                else
                break;
            }
        }
        return ans;

    }
}
