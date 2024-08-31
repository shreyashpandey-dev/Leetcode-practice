class NumArray {
    int prefSum[];

    public NumArray(int[] nums) {
        int n=nums.length;
        prefSum=new int[n];
        prefSum[0]=nums[0];
        for(int i=1;i<n;i++)
        prefSum[i]=prefSum[i-1]+nums[i];
        
    }
    
    public int sumRange(int left, int right) {
        if(left==0)
        return prefSum[right];
        return prefSum[right]-prefSum[left-1];
        
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
