class Pair
{
    int val;
    int t;
    Pair(int v,int t)
    {
        this.val=v;
        this.t=t;
    }
}
class Solution {
    public int leastInterval(char[] tasks, int n) {
        if(n==0)
        return tasks.length;
        int arr[]=new int[26];
        for(int i=0;i<tasks.length;i++)
        {
            arr[(int)tasks[i]-65]++;
        }
        //maxHeap
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<26;i++)
        {
            if(arr[i]>0)
            pq.add(arr[i]);
        }
        Queue<Pair>q=new LinkedList<>();
        int time=0;
        while(!pq.isEmpty() || !q.isEmpty())
        {
            time++;
            if(!pq.isEmpty())
            {
            int u=pq.poll();
            if(u>1)
            q.add(new Pair(u-1,time+n));
            }
            if(!q.isEmpty())
            {
            if(time==q.peek().t)
            pq.add(q.poll().val);
            }
        }
        return time;
    }
}
