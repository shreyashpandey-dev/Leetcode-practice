class Solution {
    public void dfs(int i,int j,int n,int m,char[][]board,StringBuilder curr,String word,boolean vis[][],int ans[])
    {
        curr=curr.append(board[i][j]);
        vis[i][j]=true;
        // System.out.print(i+" "+j+" "+curr+ " ");
        if(curr.toString().equals(word))
        {
            ans[0]=1;
            System.out.println("returning ans");
            return ;
        }
        // System.out.println(word.contains(curr));
        if(word.contains(curr))
        {
            if(i+1<n && !vis[i+1][j])
            dfs(i+1,j,n,m,board,curr,word,vis,ans);
            if(ans[0]!=0)
            return;
            if(j+1<m && !vis[i][j+1])
            dfs(i,j+1,n,m,board,curr,word,vis,ans);
            if(ans[0]!=0)
            return;
            if(i-1>=0 && !vis[i-1][j])
            dfs(i-1,j,n,m,board,curr,word,vis,ans);
            // System.out.println("ans is "+ans[0]);
            if(ans[0]!=0)
            return;
            if(j-1>=0 && !vis[i][j-1])
            dfs(i,j-1,n,m,board,curr,word,vis,ans);
            if(ans[0]!=0)
            return;
        }
         if(ans[0]!=0)
            return;
        vis[i][j]=false;
        curr.deleteCharAt(curr.length() - 1);

    }
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        boolean vis[][]=new boolean[n][m];
        StringBuilder curr=new StringBuilder("");
        int ans[]=new int[1];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                dfs(i,j,n,m,board,curr,word,vis,ans);
                if(ans[0]!=0)
                return true;
            }
        }
        return false;

        
    }
}
