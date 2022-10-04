class Solution {
    public int[] decode(int[] encoded, int first) {
    int[]arr=new int[encoded.length+1];
        arr[0]=first;
        int i=0;
        while(i!=encoded.length)
        {
            arr[i+1]=arr[i]^encoded[i];
            i=i+1;
         }
        return arr;
    }
}
