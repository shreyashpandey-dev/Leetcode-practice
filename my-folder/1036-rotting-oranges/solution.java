class Triplet
{
    int r;
    int c;
    int min;
    Triplet(int i,int j,int k)
    {
        r=i;
        c=j;
        min=k;
    }
}
class Solution {
    public int orangesRotting(int[][] arr) {
        int n=arr.length;
        int m=arr[0].length;
        boolean vis[][]=new boolean[n][m];
        Queue<Triplet>q=new LinkedList<>();
        int cnt1=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(arr[i][j]==2)
                {
                q.add(new Triplet(i,j,0));
                vis[i][j]=true;
                }
                if(arr[i][j]==1)
                cnt1++;
            }
        }
       // System.out.println(cnt1);
        int minute=0;
        while(!q.isEmpty())
        {
           
            Triplet p=q.poll();
            int r=p.r;
            int c=p.c;
           //  System.out.println("r="+r+" c="+c+" cnt1="+cnt1);
            minute=p.min;
            //down
            if(r+1<n)
            {
                if(arr[r+1][c]==1 && !vis[r+1][c])
                {
                    vis[r+1][c]=true;
                    q.add(new Triplet(r+1,c,minute+1));
                    cnt1--;
                }
            }
            //right
             if(c+1<m)
            {
                if(arr[r][c+1]==1 && !vis[r][c+1])
                {
                    vis[r][c+1]=true;
                    q.add(new Triplet(r,c+1,minute+1));
                    cnt1--;
                }
            }
            //up
             if(r-1>=0)
            {
                if(arr[r-1][c]==1 && !vis[r-1][c])
                {
                    vis[r-1][c]=true;
                    q.add(new Triplet(r-1,c,minute+1));
                    cnt1--;
                }
            }
            //left
             if(c-1>=0)
            {
                if(arr[r][c-1]==1 && !vis[r][c-1])
                {
                    vis[r][c-1]=true;
                    q.add(new Triplet(r,c-1,minute+1));
                    cnt1--;
                }
            }
            
        }
        return cnt1==0?minute:-1;
        
    }
}
