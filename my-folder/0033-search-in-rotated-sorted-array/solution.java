class Solution {
    public int search(int[] arr, int target) {
        int l=0;
        int n=arr.length;
        int h=n-1;
        while(l<=h)
        {
            int m=l+(h-l)/2;
            if(arr[m]==target)
            return m;
            else if(arr[l]<=arr[m])  //check if left sorted
            {
                //now check if target is in this range
                if(arr[l]<=target && target <arr[m])
                {
                    h=m-1;
                }
                else
                {
                    l=m+1;
                }
            }
            else    // right sorted
            {
                 System.out.println("In right sorted ,low="+l+" high="+h);
                //now check if target is in this range
                if(arr[m]<target && target <=arr[h])
                l=m+1;
                else
                h=m-1;
            }
           
        }
       
        return -1;
        
    }
}
