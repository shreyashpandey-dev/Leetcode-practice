class Solution {
    public int longestSquareStreak(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
        int size=-1;
       
        HashMap<Integer,Integer>m=new HashMap<>();
     for(int i=0;i<n;i++)
     {
         int x=(int)Math.sqrt(arr[i]);
         if(x*x==arr[i] && m.containsKey(x))
         {
             m.put(arr[i],m.get(x)+1);
             if(m.get(x)+1>size)
                 size=m.get(x)+1;
         }
         else
             m.put(arr[i],1);
     }
         
        
         
        return size;
    }
}
