class Solution {
    int func(int coins[],int amt,int n,int dp[][])
    {
        if(n==0)
        {
            if(amt%coins[n]==0)
            return amt/coins[n];
            else
            return (int)1e9;
        }
        if(dp[n][amt]!=-1)
        return dp[n][amt];
        int notTake=0+func(coins,amt,n-1,dp);
        int take=(int)1e9;
        if(amt>=coins[n])
        take=1+func(coins,amt-coins[n],n,dp);
        return dp[n][amt]=Math.min(take,notTake);

    }
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int dp[][]=new int[n][amount+1];
        for(int rows[]:dp)
        Arrays.fill(rows,-1);
        int res=func(coins,amount,n-1,dp);
        return res>=(int)1e9?-1:res;
        
    }
}
