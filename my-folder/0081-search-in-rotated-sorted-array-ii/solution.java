class Solution {
    public boolean search(int[] arr, int k) {
        int n=arr.length;
        int l=0;
        int h=n-1;
        while(l<=h)
        {
            int m=l+(h-l)/2;
            if(arr[m]==k)
            return true;
            if(arr[l]==arr[m] && arr[m]==arr[h])
            {
                l++;
                h--;
            }
            else if(arr[l]<=arr[m])
            {
                if(arr[l]<=k && k<arr[m])
                h=m-1;
                else
                l=m+1;
            }
            else if (arr[m]<=arr[h])
             {
                if(arr[m]<k && k<=arr[h])
                l=m+1;
                else
                h=m-1;
            }
            
        }
        return false;
    }
}
