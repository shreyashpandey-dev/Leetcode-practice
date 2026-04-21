class Solution {
    // public int numD(int i,String s,int j,String t,int dp[][])
    // {
    //     if(j<0)
    //     return 1;
    //     if(i<0)
    //     return 0;
    //     if(dp[i][j]!=-1)
    //     return dp[i][j];
    //     if(s.charAt(i)==t.charAt(j))
    //     return dp[i][j]=numD(i-1,s,j-1,t,dp)+numD(i-1,s,j,t,dp);
    //     return dp[i][j]=numD(i-1,s,j,t,dp);
    // }
    public int numDistinct(String s, String t) {
        int n1=s.length();
        int n2=t.length();
        int dp[][]=new int[n1+1][n2+1];
        // for(int rows[]:dp)
        // Arrays.fill(rows,-1);
        //base cases
        for(int i=0;i<=n1;i++)
        dp[i][0]=1;
        for(int j=1;j<=n2;j++)
        dp[0][j]=0;
        for(int i=1;i<=n1;i++)
        {
            for(int j=1;j<=n2;j++)
            {
                if(s.charAt(i-1)==t.charAt(j-1))
                   dp[i][j]=dp[i-1][j-1]+dp[i-1][j];
                else
                   dp[i][j]=dp[i-1][j]; 
            }
        }
        return dp[n1][n2];
    }
}
