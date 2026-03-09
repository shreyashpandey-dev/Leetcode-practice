class Solution {
    public String minWindow(String s, String t) {
        int n=s.length();
        int i=0;
        int j=0;
        int min=(int)1e6;
        int start=-1;
        int end=-1;
        HashMap<Character,Integer>need=new HashMap<>();
        HashMap<Character,Integer>have=new HashMap<>();
       for(int c=0;c<t.length();c++)
       {
            need.put(t.charAt(c),need.getOrDefault(t.charAt(c),0)+1);
       }
        int formed=0;
        int required=need.size();
        while(j<n)
        {
            System.out.println("Before start of loop , i="+i+" j="+j);
            char jVal=s.charAt(j);
            have.put(jVal,have.getOrDefault(jVal,0)+1);
            //tb tk window badhao jb tk saare t ke values na aa jaye
            if(need.containsKey(jVal)&& need.get(jVal).equals(have.get(jVal)))
            formed++;
            //while window is valid , shrink window
            while(formed==required)
            {
                 if ((j - i + 1) < min) {
                    min = j - i + 1;
                    start = i;
                    end = j;
                }
                char iVal=s.charAt(i);
                if(have.containsKey(iVal))
                have.put(iVal,have.get(iVal)-1);
                if(need.containsKey(iVal) && have.get(iVal)<need.get(iVal))
                formed--;
                i++;

            }
            j++;
        }
        return start==-1?"":s.substring(start,end+1);
        
    }
}
