class Solution {
    public int minOperations(int n) {
        int sum_diff_from_last=0;
        if(n%2!=0)
        {
            sum_diff_from_last=2*(n-1)+1-n;
            sum_diff_from_last/=2; 
            return sum_diff_from_last*(sum_diff_from_last+1);    
        }
        else
        {
            sum_diff_from_last=2*(n-1)+1-(n);
            sum_diff_from_last=sum_diff_from_last/2+1;
            return sum_diff_from_last*sum_diff_from_last;
        }
        
        
    }
}
