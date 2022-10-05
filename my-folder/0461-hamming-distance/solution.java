class Solution {
    public int hammingDistance(int x, int y) {
      x^=y;
        int d=0;
        while(x>0)
        {
            if(x%2==1)
                d++;
            x/=2;
        }
        return d;
    }
}
