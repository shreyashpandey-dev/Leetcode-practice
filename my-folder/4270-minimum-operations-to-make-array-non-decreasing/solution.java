class Solution {
    public long minOperations(int[] nums) {
        int res[]=nums;
        long totCost=0;
        long carry=0;
        for(int i=1;i<res.length;i++)
            {
                long prev=res[i-1]+carry;
                long curr=res[i];
                long newCarry=Math.max(0,prev-curr);
                totCost+=Math.max(0,newCarry-carry);
                carry=newCarry;
                
            }
        return totCost;
        
    }
}
