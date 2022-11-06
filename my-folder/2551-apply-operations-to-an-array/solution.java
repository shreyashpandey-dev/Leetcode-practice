class Solution {
    public int[] applyOperations(int[] arr) {
        int n=arr.length;
       for(int i=0;i<n-1;i++)
       {
           if(arr[i]==arr[i+1])
           {
               arr[i]=arr[i]*2;
               arr[i+1]=0;
           }
       }
        int ar[]=new int[n];
        int j=0;
        for( int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                ar[j]=arr[i];
                j++;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                ar[j]=arr[i];
                j++;
            }
           
        }
        return ar;
    }
}
