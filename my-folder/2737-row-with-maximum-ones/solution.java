class Solution {
    public  int lb(int[] arr,int m)
    {
        int low=0;
        int high=m-1;
        int ans=m;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]>=1)
            {
                ans=mid;
                high=mid-1;
            }
            else
            low=mid+1;
        }
        return ans;
    }
    public int[] rowAndMaximumOnes(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int max=-1;
        int res=0;
        int i=0;
        for(int rows[]:mat)
        {
            Arrays.sort(rows);
            int firstOccOf1=lb(rows,m);
            int cntOf1=m-firstOccOf1;
            if(max<cntOf1)
            {
                max=cntOf1;
                res=i;
            }
            i++;
            
        }
        return new int[]{res,max};
        
    }
}
