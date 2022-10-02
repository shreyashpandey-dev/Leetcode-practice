class Solution {
    public int commonFactors(int a, int b) {
        int c;
        int d=0;
       if(a<b)
         c=a;
        else
            c=b;
        int i=1;
        while(i<=c)
        {
            if(a%i==0 && b%i==0)
                d++;   
            i++;
        }
        return d;
    
    }
}
