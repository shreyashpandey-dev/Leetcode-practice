class Solution {
    public static int merge(int arr[],int l,int m,int r)
    {
     int n1=m-l+1;
        int n2=r-m;
        int left[]=new int[n1];
        int right[]=new int[n2];
        for(int i=0;i<n1;i++)
        {
            left[i]=arr[l+i];
        }
        for(int i=0;i<n2;i++)
        right[i]=arr[m+1+i];
        int k=l,i=0,j=0,swap=0;
        while(i<n1)
        {
            if(j<n2 && (long)left[i]>2L*right[j])
            j++;
            else
            {
            swap+=j;
            i++;
            }
        }
        k=l;i=0;j=0;
        while(i<n1 && j<n2)
        {
            if(left[i]<right[j])
            arr[k++]=left[i++];
            else
            {
            arr[k++]=right[j++];
            }
        }
        while(i<n1)
        arr[k++]=left[i++];
        while(j<n2)
        arr[k++]=right[j++];
        return swap;
    }
    public static int mergeSort(int arr[],int l,int r)
    {
        int cnt=0;
        if(l<r)
        {
            int m=l+(r-l)/2;
            cnt+=mergeSort(arr, l, m);
            cnt+=mergeSort(arr, m+1, r);
            cnt+=merge(arr,l,m,r);
        }
        return cnt;
    }
    public int reversePairs(int[] nums) {
        return mergeSort(nums,0,nums.length-1);

        
    }
}
