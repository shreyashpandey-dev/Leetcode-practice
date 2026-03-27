class Pair
{
    int key;
    int freq;
    Pair(int k,int f)
    {
        key=k;
        freq=f;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int freq[]=new int[20001];
        List<Pair>list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            freq[nums[i]+10000]++;
        }
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->a.freq-b.freq);
        for(int i=0;i<20001;i++)
        {
            pq.add(new Pair(i,freq[i]));
            if(pq.size()>k)
            pq.poll();
        }
        int ans[]=new int[k];
        int ind=0;
        while(!pq.isEmpty())
        {
            ans[ind]=pq.poll().key-10000;
            ind++;
        }
        return ans;

        
        
    }
}
