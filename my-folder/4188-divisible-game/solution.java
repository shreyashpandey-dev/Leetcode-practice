class Solution {
    static int MOD=(int)1e9+7;
    public int divisibleGame(int[] nums) {
        int n=nums.length;
        HashSet<Integer>div=new HashSet<>();
        for(int x:nums)
            {
                for(int d=1;d*d<=x;d++)
                    {
                        if(x%d==0)
                        {
                            if(d>1)
                                div.add(d);
                            int o=x/d;
                            if(o>1)
                                div.add(o);
                        }
                    }
            }
        long bestS=Long.MIN_VALUE;
        long bestK=Integer.MAX_VALUE;
        for(int k:div)
            {
                long cur=Long.MIN_VALUE;
                long sum=0;
                for(int x:nums)
                    {
                        long val=(x%k==0)?x:-x;
                        if(sum<0)
                            sum=val;
                        else
                            sum+=val;
                        cur=Math.max(cur,sum);
                    }
                if(cur>bestS|| (cur==bestS && k<bestK))
                {
                    bestS=cur;
                    bestK=k;
                }
            }
        int abs=2;
        while(div.contains(abs))
            abs++;
        int minVal=Integer.MAX_VALUE;
        for(int x:nums)
            minVal=Math.min(minVal,x);
        long absS=-1L*minVal;
        if(absS>bestS || (absS==bestS && abs<bestK))
        {
            bestS=absS;
            bestK=abs;
        }
        long ans=(bestS%MOD+MOD)%MOD;
        ans=(ans*bestK)%MOD;
        return (int)ans;
            
        
    }
}
