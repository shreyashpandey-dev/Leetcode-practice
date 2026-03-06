class Solution {
    public int[] twoSum(int[] arr, int target) {
        int n=arr.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(target-arr[i]))
            {
            int res[]={map.get(target-arr[i]),i};
            return res;
            }
            else
            map.put(arr[i],i);
        }
        return null;
        
    }
}
