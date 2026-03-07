class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        int n=s.length();
        int max=0;
        HashSet<Character>h=new HashSet<>();
        while(j<n)
        {
            while(h.contains(s.charAt(j)))
            {
                h.remove(s.charAt(i));
                i++;
            }
            h.add(s.charAt(j));
            max=Math.max(max,j-i+1);
            j++;
        }
        return max;
        
    }
}
