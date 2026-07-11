class Pair{
    int x,y;
    Pair(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
}
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
                Queue<Pair>q=new LinkedList<>();
        int n=image.length;
        int m=image[0].length;
        int totalC=0,colorC=0;
        if(color==image[sr][sc])
        return image;
        int orgCol=image[sr][sc];
        image[sr][sc]=color;
        q.add(new Pair(sr,sc));
        while(!q.isEmpty())
        {
                Pair p=q.poll();
                int x=p.x;
                int y=p.y;
                if(x+1<n && image[x+1][y]==orgCol)
                {
                    image[x+1][y]=color;
                    q.add(new Pair(x+1,y));
                }
                if(y+1<m && image[x][y+1]==orgCol)
                {
                    image[x][y+1]=color;
                    q.add(new Pair(x,y+1));
                }
                if(x-1>=0 && image[x-1][y]==orgCol)
                {
                    image[x-1][y]=color;
                    q.add(new Pair(x-1,y));
                }
                if(y-1>=0 && image[x][y-1]==orgCol)
                {
                    image[x][y-1]=color;
                    q.add(new Pair(x,y-1));
                }
        }
        return image;
        
    }
}
