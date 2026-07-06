class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==1 || nums.length==0)
        return nums.length;
        HashSet<Integer>set=new HashSet<>();
        for(int num:nums)
        {
            set.add(num);
        }
        int max=1;
        for(int x:set)
        {
            //start of sequence hai ya nhi , agar hai to , seq nikalo
            if(!set.contains(x-1))
            {
                int curr=x;
                int len=1;
                while(set.contains(curr+1))
                {
                    curr++;
                    len++;
                }
                max=Math.max(max,len);
            }
        }
        return max;
        
        
    }
}
