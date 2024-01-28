
class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer>m=new HashMap<>();
       int a=0,b=0;
       int n=nums.length;
       for(int i=0;i<n;i++)
       {
           if(m.containsKey(target-nums[i]))
           {
               a=i;
               b=m.get(target-nums[i]);
               break;
           }
            m.put(nums[i],i);
       }
       return new int[]{a,b};
    }
}
