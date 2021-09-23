class Solution {
    public int numIdenticalPairs(int[] nums) {
        int c=0,ans=0;
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int x:nums){
            h.putIfAbsent(x,0);
            c=h.get(x);
            ans+=c;
            h.put(x,c+1);
        }
        return ans;
       
}}
