class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int n=operations.length;
        int c=0;
        for(int i=0;i<n;i++){
            if(operations[i].charAt(0)=='-'||operations[i].charAt(2)=='-')
                c=c-1;
            else
                c=c+1;
        }
        return c;
    }
}
