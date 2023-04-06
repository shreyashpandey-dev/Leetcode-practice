class Solution 
    { 
    int k;
    public int countt(int ind,int a,int e,int i,int o,int u,int ans) 
        { 
        if(ind==k+1) 
            return ans;
        int z=ans;
        ans=ans+ans-a+ans-a-e+ans-a-e-i+ans-a-e-i-o;
       
        return countt(ind+1,z


      
,z-a,z-a-e,z-a-e-i,z-a-e-i-o,ans);
    }
    public int  countVowelStrings(int n) {
        if(n==1) 
            return 5;
        if(n==2) 
            return 15; 
        k=n;
       return countt(3,5,4,3,2,1,15) ;
        
    }
}
