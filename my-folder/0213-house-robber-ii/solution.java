class Solution {
    public int func(int nums[],int ind,int isLastHouseTaken,int dp[])
    {
        if(ind < 0)
        return 0;
        if(ind == 0)
            return (isLastHouseTaken == 1) ? 0 : nums[0];
        if(dp[ind] != -1)
            return dp[ind];
        if(dp[ind]!=-1)
        return dp[ind];
        int notTake=0+func(nums,ind-1,isLastHouseTaken,dp);
        int take=nums[ind]+func(nums,ind-2,isLastHouseTaken,dp);
        return dp[ind]=Math.max(take,notTake);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)
        return nums[0];
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        int takenLast=func(nums,n-1,1,dp);
        Arrays.fill(dp,-1);
        int notTakenLast=func(nums,n-2,0,dp);
        return Math.max(takenLast,notTakenLast);
        
    }
}
