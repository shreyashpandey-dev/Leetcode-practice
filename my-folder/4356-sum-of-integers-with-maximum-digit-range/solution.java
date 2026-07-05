class Solution {
    public int maxDigitRange(int[] nums) {
        int maxR=-1;
        int s=0;
        for(int n:nums)
            {
                int temp=n;
                int maxD=0;
                int minD=9;
                if(temp==0)
                    minD=0;
                while(temp>0)
                    {
                        int dig=temp%10;
                        maxD=Math.max(maxD,dig);
                        minD=Math.min(minD,dig);
                        temp/=10;
                    }
                int range=maxD-minD;
                if(range>maxR)
                {
                    maxR=range;
                    s=n;
                }
                else if(range==maxR)
                    s+=n;
            }
        return s;
        
    }
}
