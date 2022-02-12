class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer>x= new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(x.contains(nums[i])!=true)
            x.add(nums[i]);
            else
                x.remove(nums[i]);
        }
        int u=0;
        for(int y:x)
            u=y;
        return u;
            
    }
}
