class Pair{
    int x,y;
    Pair(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<Pair>q=new LinkedList<>();
        int n=grid.length;
        int m=grid[0].length;
        int totalC=0,rottenC=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]!=0)
                {
                totalC++;
                if(grid[i][j]==2)
                {
                rottenC++;
                q.add(new Pair(i,j));
                }
                }
            }
        }
        if(totalC==rottenC)
        return 0;
        int min=0;
        while(!q.isEmpty())
        {
            int len=q.size();
            for(int i=0;i<len;i++)
            {
                Pair p=q.poll();
                int x=p.x;
                int y=p.y;
                if(x+1<n && grid[x+1][y]==1)
                {
                    grid[x+1][y]=2;
                    q.add(new Pair(x+1,y));
                    rottenC++;
                }
                if(y+1<m && grid[x][y+1]==1)
                {
                    grid[x][y+1]=2;
                    q.add(new Pair(x,y+1));
                    rottenC++;
                }
                if(x-1>=0 && grid[x-1][y]==1)
                {
                    grid[x-1][y]=2;
                    q.add(new Pair(x-1,y));
                    rottenC++;
                }
                if(y-1>=0 && grid[x][y-1]==1)
                {
                    grid[x][y-1]=2;
                    q.add(new Pair(x,y-1));
                    rottenC++;
                } 
            }
            min=min+1;
            if(rottenC==totalC)
            return min;

        }
        return -1;
        
        
    }
}
