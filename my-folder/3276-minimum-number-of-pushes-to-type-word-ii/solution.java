class Pair
{
    char letter;
    int freq;
Pair(char c,int f)
{
    letter=c;
    freq=f;
}
}
class Solution {
    public int minimumPushes(String word) {
        int arr[]=new int[26];
        for(int i=0;i<word.length();i++)
        {
            arr[word.charAt(i)-'a']++;
        }
        ArrayList<Pair>pair=new ArrayList<>();
        int ind=0;
        for(int i=0;i<26;i++)
        {
            if(arr[i]!=0)
            pair.add(new Pair((char)(i+'a'),arr[i]));
        }
        Comparator<Pair>comp=new Comparator<Pair>()
        {
            public int compare(Pair a,Pair b)
            {
                if(a.freq<b.freq)
                return 1;
                else
                return -1;
            }
        };
        Collections.sort(pair,comp);
        int s=1;
        int cnt=0;
        for(int i=0;i<pair.size();i++)
        {
            cnt+=pair.get(i).freq*s;
            if(i%8==7)
            s++;
        }
        return cnt;

        
    }
}
