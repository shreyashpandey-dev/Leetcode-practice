class Solution {
    public boolean dfs(int u,int graph[][], int color[],int parColor)
    {
        color[u]=1^parColor;
        for(int v:graph[u])
        {
            if(color[v]==-1)
            {
            if (dfs(v,graph,color,color[u])==false)
            return false;
            }
            else if(color[v]==color[u])
            return false;
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int color[]=new int[n];
        Arrays.fill(color,-1);
        for(int i=0;i<n;i++)
        {
            if(color[i]==-1)
            {
                if(dfs(i,graph,color,0)==false)
                return false;
            }
        }
        return true;
        
    }
}
