class Solution {
    public int maxProfit(int[] arr) {
        int min=Integer.MAX_VALUE;
        int n=arr.length;
        int max=0;
        for(int i=0;i<n;i++)
        {
            max=Math.max(max,arr[i]-min);
            min=Math.min(min,arr[i]);
        }
        return max;
        
    }
}
