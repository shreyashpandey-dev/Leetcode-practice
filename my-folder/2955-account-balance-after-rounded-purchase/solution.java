class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int n=0;
        if(purchaseAmount%10>=5)
           n= (int)Math.ceil(purchaseAmount/10.0d)*10;
        
        else 
            n=(purchaseAmount/10)*10;
        return 100-n;
    }
}
