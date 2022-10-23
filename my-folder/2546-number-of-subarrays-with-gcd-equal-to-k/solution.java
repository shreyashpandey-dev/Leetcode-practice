class Solution {
     static int gcd(int a, int b)
    {
      if (b == 0)
        return a;
      return gcd(b, a % b);
    }
     
    public int subarrayGCD(int[] nums, int k) {
        int n=nums.length;
        int c=0;
        for(int i=0;i<n;i++)
        {
            int x=0;
            for(int j=i;j<n;j++)
            {
                x=gcd(x,nums[j]);
                if(x==k)
                    c++;
            }
        }
        return c;
    }
}
