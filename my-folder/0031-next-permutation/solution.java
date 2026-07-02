class Solution {
    public void swap(int a,int b, int arr[])
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public void nextPermutation(int[] arr) {
        int n=arr.length;
        int i=n-1;
        while(i!=0 && arr[i]<=arr[i-1])
        i--;
        int DecSeqInd=i;
        if(i!=0)
        {
        int pivot=i-1;
        i=n-1;
        while(arr[i]<=arr[pivot])
        i--;
        swap(i,pivot,arr);
        }
        int startRev=n-1;
        int endRev=DecSeqInd;
        while(startRev>endRev)
        {
            swap(startRev,endRev,arr);
            startRev--;
            endRev++;
        }

        
    }
}
