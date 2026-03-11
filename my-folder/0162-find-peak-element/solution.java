class Solution {
    public int findPeakElement(int[] arr) {
        int l=0;
        int n=arr.length;
        int h=n-1;
        while(l<h)
        {
            int m=l+(h-l)/2;
            if(arr[m]>arr[m+1])
            h=m;
            else
            l=m+1;
        }
        return l;
    }
}
