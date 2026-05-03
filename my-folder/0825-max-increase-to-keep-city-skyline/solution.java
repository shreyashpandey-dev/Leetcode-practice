class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int r[]=new int[n];
        int c[]=new int[m];
        for(int i=0;i<n;i++)
        {
            int max=0;
            for(int j=0;j<m;j++)
            {
               max=Math.max(max,grid[i][j]);
            }
            r[i]=max;
        }
        for(int j=0;j<m;j++)
        {
            int max=0;
            for(int i=0;i<n;i++)
            {
               max=Math.max(max,grid[i][j]);
            }
            c[j]=max;
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                sum+=Math.min(r[i],c[j])-grid[i][j];
            }
        }
        return sum;
        
    }
}
