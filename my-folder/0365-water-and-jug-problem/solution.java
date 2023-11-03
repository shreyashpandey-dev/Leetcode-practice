class Solution {
    public boolean canMeasureWater(int x, int y, int z) 
    {
        Queue<Integer>q=new LinkedList<>();
        HashSet<Integer>vis=new HashSet<>();
        q.add(0);
        vis.add(0);
        int steps[]={-x,+x,-y,+y};
        while(!q.isEmpty())
        {
            int curr=q.poll();
            if(curr==z)
            return true;
            for(int step:steps)
            {
                int total=curr+step;
                if(total==z)
                return true;
                if(total<0||total>x+y)
                continue;
                if(!vis.contains(total))
                {
                    vis.add(total);
                    q.add(total);
                }
            }
        } 
        return false;
    }
}
