class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int n=moves.length();
        int tM=0;
        int cntL=0;
        int cntR=0;
        char ch[]=moves.toCharArray();
        for(int i=0;i<n;i++)
        {
            if(ch[i]=='L')
            cntL++;
            else if(ch[i]=='R')
            cntR++;
        }
        int cntB=1;
        if(cntL>cntR)
        cntB=-1;
        for(int i=0;i<n;i++)
        {
            if(ch[i]=='L')
            tM--;
            else if(ch[i]=='R')
            tM++;
            else
            {
                tM+=cntB;
            }
        }
        return tM<0?-1*tM:tM;

        
    }
}
