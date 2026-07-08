class Solution {
    public int[] findOrder(int numCourses, int[][] prereq) {
        List<List<Integer>>adj=new ArrayList<>();
        int ind[]=new int[numCourses];
        for(int i=0;i<numCourses;i++)
        adj.add(new ArrayList<>());
        for(int i=0;i<prereq.length;i++)
        {
            adj.get(prereq[i][1]).add(prereq[i][0]);
            ind[prereq[i][0]]++;
        }
        int[]res=new int[numCourses];
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<numCourses;i++)
        {
            if(ind[i]==0)
            q.add(i);
        }
        int i=0;
        while(!q.isEmpty())
        {
            int u=q.poll();
            res[i++]=u;
            for(int v:adj.get(u))
            {
                ind[v]--;
                if(ind[v]==0)
                q.add(v);
            }
        }
        return i==numCourses?res:new int[]{};
        
    }
}
