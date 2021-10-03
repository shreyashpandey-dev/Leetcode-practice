class Solution {
    public int maximumWealth(int[][] accounts) {
        int temp=0,o=0;
        int m=accounts.length;
        int n=accounts[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                o=o+accounts[i][j];
            }
            if(o>temp)
                temp=o;
            o=0;}
        return temp;
        
    }
}
