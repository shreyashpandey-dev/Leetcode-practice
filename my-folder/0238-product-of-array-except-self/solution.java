class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
         int suff[]=new int[n];
        suff[n-1]=1;
        for(int i=1;i<n;i++)
            suff[n-1-i]=nums[n-i]*suff[n-i];
        int pref=1;
        for(int i=0;i<n;i++)
        { 
            int res=pref*suff[i];
            suff[i]=res;
            pref*=nums[i];
        }
        return suff;    
    }
}
