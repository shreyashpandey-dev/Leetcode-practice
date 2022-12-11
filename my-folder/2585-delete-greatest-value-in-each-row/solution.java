class Solution {
    public int deleteGreatestValue(int[][] mat) {
        int m=mat.length;
        int sum=0;
        int n=mat[0].length;
     for (int i = 0; i < m; i++) {
 
            // loop for column of matrix
            Arrays.sort(mat[i]);
     }
         int j=0;
         int max=0;
         while(j<n)
         {
    for(int i=0;i<m;i++)
    {
       max=Math.max(max,mat[i][n-1-j]);
    }
            
        sum= sum+max;
             j++;
             max=0;
         }
         return sum;
        
    }
}
