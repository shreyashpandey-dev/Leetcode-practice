class Solution {
    int n;
    char[] a,b;
    Integer[] mem;
    static final int INF=Integer.MAX_VALUE/2;
    int sol(int i)
    {
        if(i>=n)
            return 0;
        if(mem[i]!=null) 
            return mem[i];
        char c1= a[i], c2=b[i];
        int res;
        if(c1==c2)
        {
            res=sol(i+1);
        }
        else if(c1=='0' && c2=='1')
            {
                int sub=sol(i+1);
                res=(sub>=INF)?INF:1+sub;
                
            }
        else
        {
            int best=INF;
            if(i+1<n && a[i+1]=='1' && b[i+1]=='0')
            {
                int sub=sol(i+2);
                if(sub<INF)
                    best=Math.min(best,1+sub);
            }
            if(n>=2)
            {
                int sub=sol(i+1);
                if(sub<INF)
                    best=Math.min(best,2+sub);
            }
            res=best;
        }
        mem[i]=res;
        return res;
        }
    public int minOperations(String s1, String s2) {
        String m=s1+"|"+s2;
        n=s1.length();
        a=s1.toCharArray();
        b=s2.toCharArray();
        mem=new Integer[n];
        int ans=sol(0);
        return ans>=INF? -1:ans;
    }
}
