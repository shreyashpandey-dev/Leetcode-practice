class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int ind[]=new int[numCourses];
        int n=prerequisites.length;
        List<List<Integer>>adj =new ArrayList<>();
        for(int i=0;i<numCourses;i++)
        adj.add(new ArrayList<>());
        for(int i=0;i<n;i++)
        {
        adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        ind[prerequisites[i][0]]++;
        }
        Queue<Integer>q=new  LinkedList<>();
        for(int i=0;i<numCourses;i++)
        {
            if(ind[i]==0)
            q.add(i);
        }
        int cnt=0;
        while(!q.isEmpty())
        {
         cnt++;
         int u=q.poll();
         for(int v:adj.get(u))
         {
            ind[v]--;
            if(ind[v]==0)
            q.add(v);
         }   
        }
        return cnt==numCourses;
        


        
    }
}
