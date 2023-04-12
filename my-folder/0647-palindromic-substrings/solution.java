class Solution {
    public int countSubstrings(String s) { 
        int n=s.length();
        boolean dp[][]=new boolean[n][n]; 
        int cnt=0;
        for(int g=0;g<n;g++) { 
            for(int i=0,j=g;j<n;j++,i++) {
                if(g==0) 
                    { 
                    cnt++; 
                    dp[i][j]=true; 
                    } 
                else if(g==1) 
                    { 
                    if(s.charAt(i) ==s.charAt(j)) 
                        { 
                        cnt++; 
                        dp[i][j]=true; 
                        } 
                    else 
                        dp[i][j]=false; 
                    } 
                else { 
                    if(s.
charAt(i)==s.charAt(j) && dp[i+1][j-1]==true) 
                        { 
                        cnt++ ;
                        dp[i][j] =true; }
                    else 
                        dp[i][j] =false; 
                    } 
                } 
            } 
        return cnt;
                
            
        
    }
}
