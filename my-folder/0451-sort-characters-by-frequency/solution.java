class Paird
{
    char c;
    int freq;
    Paird(char ch,int f)
    {
        c=ch;
        freq=f;
    }
}
class Solution {
    public String frequencySort(String s) {
        int n=s.length();
        List<Paird>arr=new ArrayList<>();  
     HashMap<Character,Integer>map=new HashMap<>();
     for(int i=0;i<n;i++)
     {
         char d=s.charAt(i);
         map.put(d,map.getOrDefault(d,0)+1);
     }
     for(Map.Entry<Character,Integer>e:map.entrySet())
     {
         arr.add(new Paird(e.getKey(),e.getValue()));
     }
     Collections.sort(arr,(p1,p2)->Integer.compare(p2.freq,p1.freq));
     String res="";
     for(int i=0;i<arr.size();i++)
     {
         int f=arr.get(i).freq;
         while(f>0)
         {
             res=res+arr.get(i).c;
             f--;
         }
     }
     System.out.println(res);
     return res;
    }
}
