class Solution {
    public int maximumCostSubstring(String s, String chars, int[] vals) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<chars.length();i++)
        map.put(chars.charAt(i),vals[i]);
        int n=s.length();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(s.charAt(i)))
            arr[i]=map.get(s.charAt(i));
            else
            arr[i]=s.charAt(i)-'a'+1;
        }
        int prefSum=0;
        int max=0;
        for(int num:arr)
        {
            prefSum+=num;
            max=Math.max(max,prefSum);
            if(prefSum<0)
            prefSum=0;
        }
        return max;

        
    }
}
