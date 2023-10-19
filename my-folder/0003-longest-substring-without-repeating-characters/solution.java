class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashSet<Character>h=new HashSet<>();
		int i=0,j=0;
		int max=0;
		while(j<s.length())
		{
			if(h.isEmpty()||!h.contains(s.charAt(j)))
			{
				h.add(s.charAt(j));
				max=Math.max(max,h.size());
			}
			else if(h.contains(s.charAt(j)))
			{
				while(s.charAt(i)!=s.charAt(j))
				{
					h.remove(s.charAt(i));
					i++;
				}
				h.remove(s.charAt(i));
				i++;
				h.add(s.charAt(j));
				//max=Math.max(max,h.size());
			}
			j++;

		}
		return max;
        
    }
}
