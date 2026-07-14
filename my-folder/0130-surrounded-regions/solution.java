class Pair
{
    int x,y;
    Pair(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
}
class Solution {
    public void solve(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        Queue<Pair>q=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            if(board[i][0]=='O')
            {
            q.offer(new Pair(i,0));
            board[i][0]='Y';
            }
            if(board[i][m-1]=='O')
            {
            q.offer(new Pair(i,m-1));
            board[i][m-1]='Y';
            }
        }
        for(int j=0;j<m;j++)
        {
            if(board[0][j]=='O')
            {
            q.offer(new Pair(0,j));
            board[0][j]='Y';
            }
            if(board[n-1][j]=='O')
            {
            q.offer(new Pair(n-1,j));
            board[n-1][j]='Y';
            }
        }
        while(!q.isEmpty())
        {
            Pair p=q.poll();
            int x=p.x;
            int y=p.y;
            int dx[]={-1,1,0,0};
            int dy[]={0,0,-1,1};
            for(int i=0;i<4;i++)
            {
                int newX=x+dx[i];
                int newY=y+dy[i];
                if(newX>=0 && newX<n && newY>=0 && newY<m && board[newX][newY]=='O')
                {
                    q.offer(new Pair(newX,newY));
                    board[newX][newY]='Y';
                }
            }
            
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
            if(board[i][j]=='Y')
            board[i][j]='O';
            else if(board[i][j]=='O')
            board[i][j]='X';
            }
        }

    }
}
