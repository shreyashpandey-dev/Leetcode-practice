class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int max=-2,t=0,u=0,m=-2;
      for(int i=0;i<logs.length;i++)
      {
             t=logs[i][1]-t;
          max=(int)Math.max(t,max);
          if(max>m)
            u=logs[i][0];
          if(max==t  && logs[i][0]<u)
              u=logs[i][0];
          t=logs[i][1];
          m=max;
      }
        return u;
    }
}
