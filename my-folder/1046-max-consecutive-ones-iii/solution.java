class Solution {
    public int longestOnes(int[] nums, int k) {
        int cnt=0;
        int ans=0;
        int i=0,j=0;
        while(j<nums.length)
        {
            if(nums[j]==0)
                cnt++;
            if(cnt<=k)
                ans=Math.max(ans,j-i+1);
            else if(cnt>k)
            {
                while(cnt>k)
                {
                if(nums[i]==0)
                    cnt--;
                i++;
                }
            }
            j++;
        }
        return ans;
        
    }
}
