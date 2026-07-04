class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l=0;
        int n=matrix.length;
        int m=matrix[0].length;
        int h=n*m-1;
        while(l<=h)
        {
            int mid=((l+h)/2);
            int i=mid/m;
            int j=mid%m;
            if(target==matrix[i][j])
            return true;
            if(target<matrix[i][j])
            h=mid-1;
            else
            l=mid+1;

        }
        return false;
        
    }
}
