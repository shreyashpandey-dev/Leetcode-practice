class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int[] mav=nums;
        int n=nums.length;
        int maxL=nums[0];
        int ans=Integer.MIN_VALUE;
        for(int i=k;i<n;i++){
            maxL=Math.max(maxL,nums[i-k]);
            ans=Math.max(ans,maxL+nums[i]);
        }
        return ans;
        
    }
}
