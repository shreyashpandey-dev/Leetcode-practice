class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i=0;i<hand.length;i++)
        {
            pq.add(hand[i]);
        }
        int gS=0;
        int prev=0;
        while(!pq.isEmpty())
        {  
            if(gS==0)
            {
            gS++;
             prev=pq.poll();
            }
            else if(pq.peek()==prev+1)
            {
                gS++;
                prev=pq.poll();
            }
            else
            {
                Queue<Integer>q=new LinkedList<>();
                while(!pq.isEmpty()&& pq.peek()!=prev+1)
                {
                    q.add(pq.poll());
                }
                if(pq.isEmpty())
                return false;
                prev= pq.poll();
                gS++;
                while(!q.isEmpty())
                {
                    pq.add(q.poll());
                }
            }
            if(gS==groupSize)
            gS=0;       
        }
        return gS==0;
        
    }
}
