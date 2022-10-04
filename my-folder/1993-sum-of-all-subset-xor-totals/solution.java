class Solution {
    public int subsetXORSum(int[] nums) {
        int i=0;
        int sum=0;
        int n=nums.length;
        //while(i!=2 ke pow(n))
        int s=0;
        while(i<(1<<n))
        {
          for(int j=0;j<n;j++)
          {
             if((i & (1<<j))>0)
                 s^=nums[j];
          }
             sum+=s;
            s=0;
            i++;
        }
        return sum;
    }
}
