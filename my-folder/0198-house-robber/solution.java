class Solution {
    int func(int nums[],int n, int dp[])
    {
        if(n<0)
        return 0;
        if(n==0)
        return nums[0];
        if(dp[n]!=-1)
        return dp[n];
        int take=nums[n];
        return dp[n]=Math.max((take+func(nums,n-2,dp)),func(nums,n-1,dp));
    }
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        return func(nums,n-1,dp);
    }
}
