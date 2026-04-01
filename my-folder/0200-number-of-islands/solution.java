class Solution {
    public void dfs(char grid[][],int i,int j,boolean vis[][])
    {
        if(i<0 || i>=grid.length||j<0 ||j>=grid[0].length||grid[i][j]=='0' || vis[i][j])
        return;
        vis[i][j]=true;
        dfs(grid,i-1,j,vis); //go to neighbour N,W,S,E
        dfs(grid,i,j-1,vis);
        dfs(grid,i+1,j,vis);
        dfs(grid,i,j+1,vis);

    }
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean vis[][]=new boolean[n][m];
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]=='1' && !vis[i][j])  //its a land and its not visited
                {
                    dfs(grid,i,j,vis);
                    cnt++;
                }
            }
        }
        return cnt;
        
    }
}
