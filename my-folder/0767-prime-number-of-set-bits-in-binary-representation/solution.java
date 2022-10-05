class Solution {
   
    public int countPrimeSetBits(int left, int right) {
       
        int c=0;
        int y=0;
      for(int i=left;i<=right;i++)
      {
          y=665772>>Integer.bitCount(i);
          if((y&1)==1)
              c++;
      }
        return c;
    }
}
