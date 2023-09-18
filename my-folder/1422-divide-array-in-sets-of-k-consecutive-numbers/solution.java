class Solution {
    public boolean isPossibleDivide(int[] hand, int groupSize) {
        if(hand.length%groupSize!=0)
        return false;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<hand.length;i++)
        {
            map.put(hand[i],map.getOrDefault(hand[i],0)+1);
        }
        PriorityQueue<Integer>pq=new PriorityQueue<>(map.keySet());
        // while(!pq.isEmpty())
        // {
        //     System.out.print(pq.poll()+" ");
        // }
        while(!pq.isEmpty())
        {
            int smallest=pq.peek();
            for(int i=smallest;i<smallest+groupSize;i++)
            {
                if(map.containsKey(i)==false)
                return false;
                map.put(i,map.get(i)-1);
                if(map.get(i)==0)
                {
                    if(pq.peek()!=i)
                    return false;
                    pq.poll();
                }
                
            }
        }
         return true;

    }
}
