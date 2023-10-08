class Solution {
    public int findNoOfDay(int capacity,int arr[])
    {
        int wtSum=0;
        int Day=0;
        for(int i=0;i<arr.length;i++)
        {
            if(wtSum<capacity)
            {
                wtSum+=arr[i];
            }
           if(wtSum==capacity)
            {
                Day++;   
                wtSum=0;
            }
            if(wtSum>capacity)
            {
                Day++;
                wtSum=arr[i];
            }
        }
        if(wtSum>0)
        Day++;
        return Day;
    }
    public int shipWithinDays(int[] arr, int d) {
        int n=arr.length;
        int low=0;
        int high=0;
        for(int i=0;i<n;i++)
        {
            if(low<arr[i])
            low=arr[i];
            high=high+arr[i];
        }
        while(low<=high)
        {
            int mid=low+(high-low)/2;
           int day=findNoOfDay(mid,arr);
           if(day<=d)
           high=mid-1;
           else
           low=mid+1;
        }
        return low;
        
    }
}
