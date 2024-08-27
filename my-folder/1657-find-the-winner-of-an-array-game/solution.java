class Pair
{
    int x;
    int cnt;
    Pair(int x,int c)
    {
        this.x=x;
        cnt=c;
    }
}
class Solution {
    public int getWinner(int[] nums, int k) {
        ArrayList<Pair>arr=new ArrayList<>();
        for(int x:nums)
        arr.add(new Pair(x,0));
        while(true)
        {
            if(arr.get(0).x>arr.get(1).x)
            {
            Pair element= arr.remove(1);
            int count=arr.get(0).cnt+1;
            if(count==k||count==nums.length-1)
            return arr.get(0).x;
            arr.add(element);
            arr.set(0,new Pair(arr.get(0).x,count));
            }
            else
            {
            int count=arr.get(1).cnt+1;
            if(count==k||count==nums.length-1)
            return arr.get(1).x;
            arr.set(1,new Pair(arr.get(1).x,count));
            Pair element= arr.remove(0);
            arr.add(element);    
            }
        }


        
    }
}
