class Solution {
    public int findComplement(int num) {
        int i=num;
    i |= (i >>  1);
    i |= (i >>  2);
    i |= (i >>  4);
    i |= (i >>  8);
    i |= (i >> 16);
    i= i - (i >>> 1);
       return ~num & ((i << 1) - 1);
    }
}
