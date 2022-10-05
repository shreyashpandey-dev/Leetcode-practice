class Solution {
public:
    int hammingDistance(int x, int y) {
      x^=y;
        int c=0;
        while(x)
        {
            x&=x-1;
            c++;
        }
        return c;
    }
};
