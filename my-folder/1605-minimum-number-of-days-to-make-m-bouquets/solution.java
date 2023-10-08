class Solution {
    public int check(int mid,int n,int arr[],int k,int m)
    {
        int reqK=0;
        int M=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<=mid)
            {
                reqK++;
                if(k==reqK)
                {
                M++;
                reqK=0;
                }
            }
            else
            reqK=0;
        }
        return M;
    }
    public int minDays(int[] arr, int m, int k) {
        int n=arr.length;
        if((long)m*k>n)
        return -1;
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(min>arr[i])
            min=arr[i];
            if(max<arr[i])
            max=arr[i];
        }
        int l=min;
        int h=max;
        int temp=0;
        while(l<=h)
        {
             int mid=l+(h-l)/2;
             int ans=check(mid,arr.length,arr,k,m);
            if(ans>=m)
            {
                h=mid-1;
            }
            else
            l=mid+1;
        }
        return l; 
    }
}
