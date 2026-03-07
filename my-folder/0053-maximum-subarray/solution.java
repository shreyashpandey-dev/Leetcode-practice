class Solution {
    public int maxSubArray(int[] arr) {
        int max=arr[0];
        int prefSum=0;
        for(int i=0;i<arr.length;i++)
        {
            prefSum=prefSum+arr[i];
            max=Math.max(prefSum,max);
            if(prefSum<0)
            prefSum=0;
        }
        return max;
        
    }
}
