class Solution {
    public void dfs(int i,int n,List<Integer>res)
    {
        if(i>n)
        return;
        res.add(i);
        for(int j=0;j<=9;j++)
        {
            int number_that_can_be_formed_with_i=i*10+j;
            if(number_that_can_be_formed_with_i<=n)
            dfs(number_that_can_be_formed_with_i,n,res);
            else
            break;
        }
    }
    public List<Integer> lexicalOrder(int n) {
        List<Integer>res=new ArrayList<>();
        for(int i=1;i<=9;i++)
        {
            dfs(i,n,res);
            
        }
        return res;
    }
}
