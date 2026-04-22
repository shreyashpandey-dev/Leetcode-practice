class Solution {
    public int lis(int i,int prev_ind,int nums[],int n,int dp[][])
    {
        if(i==n+1)
        return 0;
        if(dp[i][prev_ind]!=-1)
        return dp[i][prev_ind];
        int not_take=0+lis(i+1,prev_ind,nums,n,dp);
        int take=0;
        if(prev_ind==0 || nums[i-1]>nums[prev_ind-1])
        take=1+lis(i+1,i,nums,n,dp);
        return dp[i][prev_ind]=Math.max(take,not_take);
    }
    public int lengthOfLIS(int[] nums) {
        int prev_ind=0;
        int n=nums.length;
        int dp[][]=new int[n+1][n+1];
        for(int rows[]:dp)
        Arrays.fill(rows,-1);
        return lis(1,prev_ind,nums,n,dp);
        
    }
}
