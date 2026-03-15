class Solution {
    public long calc(int k,int[]piles)
    {
        long mod_sum=0;
        for(int x:piles)
        {
            mod_sum+=(x+k-1)/k;
        }
        return mod_sum;
        
    }
    public int minEatingSpeed(int[] piles, int target) {
        int max=-1;
        int min=1;
        for(int x:piles)
        {
            if(max<x)
            max=x;
        }
        int res=(int)1e9;
        int l=min;
        int h=max;
        while(l<=h)
        {
            int m=l+(h-l)/2;
            long exp_res=calc(m,piles);
            if(exp_res<=target)
            {
                res=m;
                h=m-1;
            }
            else if (exp_res>target)
            l=m+1;     
        }
        return res;
        
    }
}
