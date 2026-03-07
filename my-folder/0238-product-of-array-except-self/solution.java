class Solution {
    public int[] productExceptSelf(int[] arr) {
        int n=arr.length;
        int prefPrd[]=new int[n];
        int suffPrd[]=new int[n];
        prefPrd[0]=1;
        suffPrd[n-1]=1;
        for(int i=1;i<n;i++)
        {
            prefPrd[i]=prefPrd[i-1]*arr[i-1];
            suffPrd[n-i-1]=suffPrd[n-i]*arr[n-i];
        }
        int prd[]=new int[n];
        for(int i=0;i<n;i++)
        {
            prd[i]=prefPrd[i]*suffPrd[i];
        }
        return prd;
        
    }
}
