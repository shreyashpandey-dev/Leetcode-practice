class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int c=0;
       for(int i=0;i<words.length;i++)
       {
           int flag=0;
           String s=words[i];
           for(int j=0;j<s.length();j++)
           {
               if(allowed.contains(String.valueOf(s.charAt(j)))!=true)
               {
                   flag=1;
                   break;
               }
                   
           }
           if(flag!=1)
               c++;
       }
        return c;
    }
}
