class Solution {
    public int findMaxInd(int mat[][],int n,int m,int j)
    {
        int maxVal=-1;
        int maxInd=-1;
        for(int i=0;i<n;i++)
        {
            if(mat[i][j]>maxVal)
            {
                maxVal=mat[i][j];
                maxInd=i;
            }
        }
        return maxInd;
    }
    public int[] findPeakGrid(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int low=0;
        int high=m-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            int maxRowInd=findMaxInd(mat,n,m,mid);
            int left=mid-1>=0?mat[maxRowInd][mid-1]:-1;
            int right=mid+1<m?mat[maxRowInd][mid+1]:-1;
            if(mat[maxRowInd][mid]>left && mat[maxRowInd][mid]>right)
            return new int[]{maxRowInd,mid};
            else if(left>mat[maxRowInd][mid])
            high=mid-1;
            else
            low=mid+1;
        }
        return new int[]{-1,-1};
    }
}
