class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // int i=0,n=nums.length;
        // int cnt=0;
        // int max=0;
        // for(i=0;i<n;i++)
        // {
        //     if(nums[i]!=0)
        //         cnt++;
        //     else
        //     {
                
        //         max=Math.max(max,cnt);
        //         cnt=0;
        //     }
        // }
        // return cnt>max?cnt:max;
        int max=0;
        int cnt=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                if(cnt==-1)
                cnt=1;
                else
                cnt++;
            }
            else
            {
                max=Math.max(max,cnt);
                cnt=-1;
            }

            
        }
        return max>cnt?max:cnt;
        
        
    }
}
