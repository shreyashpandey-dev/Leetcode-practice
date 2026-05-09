class Solution {
    public int minGenerations(int[][] pts, int[] tgt) {
        int[][] morv=pts;
        Set<Long>seen=new HashSet<>();
        List<long[]>all=new ArrayList<>();
        long tk=enc(tgt[0],tgt[1],tgt[2]);
        for(int[]p: morv)
            {
                long k=enc(p[0],p[1],p[2]);
                if(k==tk) return 0;
                if(seen.add(k)) all.add(new long[]{p[0],p[1],p[2]});
            }
        for(int g=1;g<=64;g++)
            {
                List<long[]>nxt=new ArrayList<>();
                int sz=all.size();
                for(int i=0;i<sz;i++)
                        for(int j=i+1;j<sz;j++)
                            {
                                long[] a=all.get(i),b=all.get(j);
                                long mx=(a[0]+b[0])/2,my=(a[1]+b[1])/2 ,mz=(a[2]+b[2])/2;
                                long k=enc(mx,my,mz);
                                 if(seen.add(k))
                                 {
                                     if(k==tk) return g;
                                     nxt.add(new long[]{mx,my,mz});
                                 }
                            }
                        if(nxt.isEmpty()) return -1;
                        all.addAll(nxt);
                    }
                return -1;
            }
        long enc(long x, long y, long z) { return (x<<40)|(y<<20)|z; }
        
}
