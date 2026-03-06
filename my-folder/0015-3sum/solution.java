class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>>ans=new ArrayList<>();
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n-2;i++)
        {
            while(i!=0 && i<(n-2) && arr[i]==arr[i-1])
            i++;
            int j=i+1;
            int k=n-1;
            while(j<k)
            {
                if(arr[i]+arr[j]+arr[k]==0)
                {
                List<Integer>subAns=new ArrayList<>();
                subAns.add(arr[i]);
                subAns.add(arr[j]);
                subAns.add(arr[k]);
                ans.add(subAns);
                j++;
                k--;
                while(j<k && (arr[j]==arr[j-1]))  //save from triplet
                j++;
                while(j<k && (arr[k]==arr[k+1]))
                k--;
                }
                else if(arr[i]+arr[j]+arr[k]<0)
                {
                    j=j+1;
                }
                else
                k=k-1;
            }
        }
        return ans;
        
        
    }
}
