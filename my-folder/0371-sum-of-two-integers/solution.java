class Solution {
    public int getSum(int a, int b) {
        int c=-1;
        while(c!=0)
        {
            int sum=a^b;
            c=(a&b)<<1;
            a=sum;
            b=c;
        }
        return a;
        
    }
}
