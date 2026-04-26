class Solution {
    public List<Integer> findValidElements(int[] nums) {
        int n=nums.length;
        int prefMax[]=new int[n];
        prefMax[0]=Integer.MIN_VALUE;
        for(int i=1;i<n;i++)
            prefMax[i]=Math.max(prefMax[i-1],nums[i-1]);

        int suffMax[]=new int[n];
        suffMax[n-1]=Integer.MIN_VALUE;
        for(int i=n-2;i>=0;i--)
            suffMax[i]=Math.max(suffMax[i+1],nums[i+1]);

        List<Integer>res=new ArrayList<>();
        for(int i=0;i<n;i++)
            {
                if(nums[i]>prefMax[i]||nums[i]>suffMax[i])
                    res.add(nums[i]);
            }

        return res;
        
    }
}
