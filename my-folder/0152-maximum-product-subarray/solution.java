class Solution {
    public int maxProduct(int[] arr) {
        int pref=1;
        int max=Integer.MIN_VALUE;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
           pref*=arr[i];
           max=Math.max(max,pref);
           if(pref==0)
           pref=1;
        } 
        pref=1;
        for(int i=n-1;i>=0;i--)
        {
           pref*=arr[i];
           max=Math.max(max,pref);
           if(pref==0)
           pref=1;
        }

        return max;
    }
}
