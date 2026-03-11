class Solution {
    public int characterReplacement(String s, int k) {
        int max=1;
        int n=s.length();
        int i=0;
        int j=0;
        int freq[]=new int[26];
        int maxFreq=0;
        while(j<n)
        {
            freq[s.charAt(j)-'A']++;
            maxFreq=Math.max(maxFreq,freq[s.charAt(j)-'A']);
            //shrink window if u cannot replace characters
            while((j-i+1)-maxFreq>k)
            {
                freq[s.charAt(i)-'A']--;
                i++;
            }
            max=Math.max(max,(j-i+1));
            j++;
        }
        return max;
    }
}
