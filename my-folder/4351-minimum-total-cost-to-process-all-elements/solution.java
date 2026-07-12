class Solution {
    public int minimumCost(int[] nums, int k) {
       long pref=0;
        long ops=0;
        long MOD=1_000_000_007L;
        for(int x: nums)
            {
                long need=pref+x-k;
                if(need>0)
                {
                    long reqO=(need+k-1)/k;
                    if(reqO>ops)
                        ops=reqO;
                }
                pref+=x;
            }
        long ans=(ops%MOD)*((ops+1)%MOD)%MOD;
        ans=ans*500000004L%MOD;
        return (int)ans;
        
    }
}
