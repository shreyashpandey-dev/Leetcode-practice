class Solution {
    // public int func(int n,int dp[])
    // {
    //     if(n<=1)
    //     return 1;
    //     if(dp[n]!=-1)
    //     return dp[n];
    //     return dp[n]=func(n-1,dp)+func(n-2,dp);
    // }
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        // dp[0]=1;
        // dp[1]=1;
        int prev2=1;
        int prev=1;
        for(int i=2;i<=n;i++)
        {
        // dp[i]=dp[i-2]+dp[i-1];
        int curr_i=prev2+prev;
        prev2=prev;
        prev=curr_i;
        }
        // return dp[n];
        return prev;
        
        
    }
}
