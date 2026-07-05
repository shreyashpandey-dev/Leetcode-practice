class Solution {
    public boolean canMakeSubsequence(String s, String t) {
        int n=s.length();
        int m=t.length();
        int[] pref=new int[n];
        int j=0;
        for(int i=0;i<n;i++)
            {
                while(j<m && t.charAt(j)!=s.charAt(i))
                    j++;
                if(j==m)
                {
                    while(i<n)
                        {
                            pref[i++]=-1;
                        }
                    break;
                }
                pref[i]=j;
                j++;
            }
        int suff[]=new int[n];
        j=m-1;
        for(int i=n-1;i>=0;i--)
            {
            while(j>=0 && t.charAt(j)!=s.charAt(i))
                j--;
            if(j<0)
            {
                while(i>=0)
                    suff[i--]=-1;
                break;
            }
            suff[i]=j;
            j--;
            }
        if(pref[n-1]!=-1)
            return true;
        for(int i=0;i<n;i++)
            {
                int l=-1;
                if(i>0){
                    if(pref[i-1]==-1)
                        continue;
                    l=pref[i-1];
                }
                int r=m;
                if(i<n-1)
                {
                    if(suff[i+1]==-1)
                        continue;
                    r=suff[i+1];
                }
                if(l+1<r)
                    return true;
            }
        return false;
        
    }
}
