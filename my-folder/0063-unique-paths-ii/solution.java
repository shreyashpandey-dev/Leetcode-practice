class Solution {
    int Path(int i,int j,int mat[][],int dp[][])
    {
        if(i<0 || j<0)
        return 0;
        if(i==0 && j==0)
        return 1;
        if(dp[i][j]!=-1)
        return dp[i][j];
        int left=0;
        if(j-1>=0 && mat[i][j-1]==0)
        left=Path(i,j-1,mat,dp);
        int up=0;
        if(i-1>=0 && mat[i-1][j]==0)
        up=Path(i-1,j,mat,dp);
        return dp[i][j]=up+left;
    }
    public int uniquePathsWithObstacles(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int dp[][]=new int[n][m];
        if(mat[0][0]==1 || mat[n-1][m-1]==1)
        return 0;
        for(int[] rows: dp)
        Arrays.fill(rows,-1);
        return Path(n-1,m-1,mat,dp);
        
    }
}
