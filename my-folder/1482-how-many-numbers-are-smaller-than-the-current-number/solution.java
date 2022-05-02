class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int y=nums.length;
       int ar[]=new int[y];
        for(int i=0;i<y;i++)
        {
            int c=0;
            for(int j=0;j<y;j++)
            {
                if(nums[i]>nums[j])
                    c++;
            }
            ar[i]=c;
        }
        return ar;
    }
}
