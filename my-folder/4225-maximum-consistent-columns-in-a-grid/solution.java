class Solution {
    boolean isVal(int grid[][],int i,int j,int limit,int m)
    {
        for(int k=0;k<m;k++)
            {
                long diff=Math.abs((long)grid[k][j]-(long)grid[k][i]);
                if(diff>limit)
                    return false;
            }
        return true;
    }
    public int maxConsistentColumns(int[][] grid, int limit) {
        int m=grid.length;
        int n=grid[0].length;
        int[] dp=new int[n];
        Arrays.fill(dp,1);
        int ans=1;
        for(int j=1;j<n;j++)
            {
                for(int i=0;i<j;i++)
                    {
                        if(isVal(grid,i,j,limit,m))
                        {
                            if(dp[i]+1>dp[j])
                                dp[j]=dp[i]+1;
                        }
                    }
                ans=Math.max(ans,dp[j]);
            }
            return ans;
    }
}
