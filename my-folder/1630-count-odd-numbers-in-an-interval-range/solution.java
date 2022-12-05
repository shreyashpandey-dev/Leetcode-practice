class Solution {
   
    public int countOdds(int low, int high) {
       if(low%2==0 && high%2==0)
           return (high-low-2)/2+1;
        else if(low%2!=0 && high%2!=0)
            return 2+(high-low-2)/2;
        else
            return 1+(high-low-1)/2;
        
}
}
