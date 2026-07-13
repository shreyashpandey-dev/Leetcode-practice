class Pair{
    int x,y;
    Pair(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
}
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        Queue<Pair>q=new LinkedList<>();
        int n=mat.length;
        int m=mat[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]==0)
                {
                    q.add(new Pair(i,j));
                }
                else
                mat[i][j]=-1;
            }
        }
        while(!q.isEmpty())
        {
            Pair p=q.poll();
            int x=p.x;
            int y=p.y;
            int dx[]={1,-1,0,0};
            int dy[]={0,0,-1,1};
            for(int i=0;i<4;i++)
            {
                int newX=x+dx[i];
                int newY=y+dy[i];
                if(newX>=0 && newX<n && newY>=0 && newY<m && mat[newX][newY]==-1)
                {
                    mat[newX][newY]=mat[x][y]+1;
                    q.add(new Pair(newX,newY));
                }
            }
        }
        return mat;

        
    }
}
