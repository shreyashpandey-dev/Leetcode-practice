class Solution {
    public int[] minOperations(String boxes) {
        char ch[]=boxes.toCharArray();
        int n=boxes.length();
        int res[]=new int[n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(ch[j]=='1')
                res[i]=res[i]+Math.abs(i-j);
            }
        }
        return res;
        
    }
}
