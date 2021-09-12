class Solution {
    public boolean isPalindrome(int x) {
       if(x<0)
           return false;
       int t =x,rev=0,r;
        while(x>0){
           r=x%10;
            rev =rev*10+r;
            x/=10;
        }
       if(t==rev) 
           return true;
        return false;
    }
}
