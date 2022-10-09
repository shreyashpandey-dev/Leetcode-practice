class Solution {
    public int[] findArray(int[] pref) {
        int arr[]=new int[pref.length];
        int pref_xor=0;
        for(int i=0;i<pref.length;i++)
        {
            arr[i]=pref[i]^pref_xor;
            pref_xor^=arr[i];
        }
        return arr;
        
    }
}
