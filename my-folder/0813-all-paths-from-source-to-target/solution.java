class Solution {
    public void dfs(int u,int n,List<List<Integer>>adj,boolean vis[],List<List<Integer>>ans,List<Integer>path)
    {
        path.add(u);
        if(u==n)
        {
            List<Integer>copied=new ArrayList<>(path);
            ans.add(copied);
            path.remove(path.size()-1);
            return;
        }
        if(!vis[u])
        {
            vis[u]=true;
        }
        for(int v:adj.get(u))
        {
            dfs(v,n,adj,vis,ans,path);
        }
        path.remove(path.size()-1);
        vis[u]=false;
        System.out.println(path);
       }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int n=graph.length;
        List<List<Integer>>adj=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
            for(int j=0;j<graph[i].length;j++)
            {
                adj.get(i).add(graph[i][j]);
            }
        }
        for(int i=0;i<n;i++)
        System.out.println(adj.get(i));
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>path=new ArrayList<>();
        boolean vis[]=new boolean[n];
        dfs(0,n-1,adj,vis,ans,path);
        return ans;
        
    }
}
