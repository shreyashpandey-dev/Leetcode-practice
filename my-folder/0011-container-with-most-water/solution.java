class Solution {
    public int maxArea(int[] arr) {
        int l=0;
        int r=arr.length-1;
        int max=0;
        while(l<r)
        {
            max=Math.max(max,Math.min(arr[l],arr[r])*(r-l));
            if(arr[l]<arr[r])
            l++;
            else
            r--;
        }
        return max;
}
        
    }
    
