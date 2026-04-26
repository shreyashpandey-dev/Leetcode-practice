class Solution {
    private int vowIndex(char c)
    {
    return "aeiou".indexOf(c);
    }
    public String sortVowels(String s) {
        String res=s;
        int freq[]=new int[5];
        int firstOcc[]=new int[5];
        Arrays.fill(firstOcc,Integer.MAX_VALUE);

        //freq and firstOcc nikalo

        for(int i=0;i<res.length();i++)
            {
                int idx=vowIndex(res.charAt(i));
                if(idx!=-1)
                {
                    freq[idx]++;
                        if(firstOcc[idx]==Integer.MAX_VALUE)
                        {
                            firstOcc[idx]=i;
                        }
                }
            }

        Integer[] order={0,1,2,3,4};
        Arrays.sort(order,(a,b)->
            {
            if(freq[b]!=freq[a])
                return freq[b]-freq[a];
                return firstOcc[a]-firstOcc[b];
            });


        StringBuilder vowSeq=new StringBuilder();
        for(int i : order)
            {
                for(int j=0;j<freq[i];j++)
                    vowSeq.append("aeiou".charAt(i));
            }

        StringBuilder r=new StringBuilder(res);
        int ptr=0;
        for(int i=0;i<r.length();i++)
            {
            if(vowIndex(r.charAt(i))!=-1)
            r.setCharAt(i,vowSeq.charAt(ptr++));
            }

        return r.toString();
        

        
        
    }
}
