class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        //int c=0;
        int c=(digits[n-1]+1)/10;
        digits[n-1]=(digits[n-1]+1)%10;
        for(int i=n-2;i>=0;i--)
        {
            int sum=digits[i]+c;
            digits[i]=sum%10;
            c=sum/10;
        }
        if(c==0)
        return digits;
        int newarr[]=new int[n+1];
        newarr[0]=c;
        for(int i=0;i<n;i++)
        newarr[i+1]=digits[i];
        return newarr;
        
    }
}
