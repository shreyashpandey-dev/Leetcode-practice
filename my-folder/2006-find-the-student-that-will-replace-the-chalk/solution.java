class Solution {
    public int chalkReplacer(int[] chalk, int o) {
        int i=0;
        long sum=0;
        long k=o;
        for(int x:chalk)
        sum+=x;
         k=k%sum;
        while(true)
        {
            k=k-chalk[i];
            if(k<0)
            return i;
            i=(i+1)%chalk.length;
        }
        
    }
}
