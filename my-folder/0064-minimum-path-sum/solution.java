class Solution {
    public int rec(int[][]arr,int i,int j,int[][] dp)
    {
        if(i<0 ||j<0)
            return Integer.MAX_VALUE;
        if(i==0&& j==0)
            return arr[0][0];
        if(dp[i][j]!=-1)
            return dp[i][j];
        return dp[i][j]=Math.min(rec(arr,i-1,j,dp),rec(arr,i,j-1,dp))+arr[i][j];
    }
    public int minPathSum(int[][] arr) {
        int m=arr.length;
        int n=arr[0].length;
        int dp[][]=new int[m][n];
        dp[0][0]=arr[0][0];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 && j==0)
                    continue;
                int up=Integer.MAX_VALUE;
                if(i>=1)
                    up=dp[i-1][j];
                int left=Integer.MAX_VALUE;
                if(j>=1)
                left=dp[i][j-1];
                dp[i][j]=Math.min(up,left)+arr[i][j];
                
            }
        }
       return dp[m-1][n-1];
        
    }
}
