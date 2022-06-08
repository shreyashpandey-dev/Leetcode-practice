class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int m=arr2.length,n=arr1.length;
        int max=-1;
        for(int i=0;i<n;i++)
        {
            if(max<arr1[i])
                max=arr1[i];
        }
        Arrays.sort(arr1);
        int arr[]=new int[max+1];
        for(int i=0;i<n;i++)
        {
            arr[arr1[i]]++;
        }
        Set<Integer>h=new HashSet<Integer>();
        List<Integer>y=new ArrayList<Integer>();
        int y1[]=new int[n];
        for(int i=0;i<m;i++)
            h.add(arr2[i]);
        for(int i=0;i<m;i++)
        {
            while(arr[arr2[i]]>0)
            {
                y.add(arr2[i]);
                arr[arr2[i]]--;
            }
                
        }
        for(int i=0;i<n;i++)
        {
            if(h.contains(arr1[i])==false)
            {
                y.add(arr1[i]);
            }
        }
        for(int i=0;i<n;i++)
            y1[i]=y.get(i);
        return y1;
        
        
    }
}
