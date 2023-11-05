class Solution {
    int cnt=0;
    public void DFS(int arr[][],int i,int j,boolean vis[][],int m,int n)
    {
        vis[i][j]=true;
        cnt++;
        //up
        if(i-1>=0 && arr[i-1][j]==1 &&!vis[i-1][j])
        {
            DFS(arr,i-1,j,vis,m,n);
        }
        //down
        if(i+1<m &&arr[i+1][j]==1 && !vis[i+1][j])
        {
            DFS(arr,i+1,j,vis,m,n);
        }
        //right
        if(j+1<n && arr[i][j+1]==1 &&!vis[i][j+1])
        {
            DFS(arr,i,j+1,vis,m,n);
        }
        if(j-1>=0 && arr[i][j-1]==1 &&!vis[i][j-1])
        {
            DFS(arr,i,j-1,vis,m,n);
        }

    }
    public int maxAreaOfIsland(int[][] arr) {
        int m=arr.length;
        int n=arr[0].length;
        boolean vis[][]=new boolean[m][n];
        int max=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]==1 && !vis[i][j])
                {
                DFS(arr,i,j,vis,m,n);
                max=Math.max(max,cnt);
                cnt=0;
                }
            }
        }
        return max;
        
    }
}
