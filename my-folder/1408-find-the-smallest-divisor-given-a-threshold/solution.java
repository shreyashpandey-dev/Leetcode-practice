class Solution {
     public  int div(int num,int arr[],int n)
    {
        int sum=0;
        double number=1.0*num;
        for(int i=0;i<n;i++)
        {
            sum=sum+(int)Math.ceil(arr[i]/number);
        }
        return sum;
    }
    public int smallestDivisor(int[] arr, int limit) {
        int n=arr.length;
       int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
       for(int i=0;i<n;i++)
       {
           if(min>arr[i])
           min=arr[i];
           if(max<arr[i])
           max=arr[i];
       }
       int low=1;
       int high=(int)1e6;
       while(low<=high)
       {
           int mid=low+(high-low)/2;
           if(div(mid,arr,n)<=limit)
           high=mid-1;
           else
           low=mid+1;
       }
       return low;
    }
}
