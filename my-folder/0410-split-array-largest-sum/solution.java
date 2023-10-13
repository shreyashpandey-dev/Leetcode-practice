class Solution {
    public int noOfSubArr(int arr[],int x,int n)
    {
        int sum=0;
        int cntSubArr=0;
        for(int i=0;i<n;i++)
        {
            if(sum<x)
            sum+=arr[i];
            if(sum==x)
            {
                sum=0;
                cntSubArr++;
            }
            if(sum>x)
            {
                sum=arr[i];
                cntSubArr++;
            }
        }
        if(sum>0)
        cntSubArr++;
        return cntSubArr;
    }
    public int splitArray(int[] arr, int k) {
        int n=arr.length;
        int low=Integer.MIN_VALUE;
        int high=0;
        for(int i=0;i<n;i++)
        {
            low=Math.max(low,arr[i]);
            high+=arr[i];
        }
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(noOfSubArr(arr,mid,n)<=k)
            high=mid-1;
            else
            low=mid+1;
        }
        return low;
        
    }
}
