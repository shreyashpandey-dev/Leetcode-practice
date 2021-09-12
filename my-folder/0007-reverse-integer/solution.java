class Solution {
    public int reverse(int x) {
     long t=x;
        long rev =0,r;
        while(t!=0){
            r=t%10;
            rev =rev*10+r;
            t/=10;
        }
        return(rev>Integer.MAX_VALUE||rev<Integer.MIN_VALUE)?0:(int)rev;
    }
}
