class Solution {
    public int findceil(int arr[],int k)
    {
        int l=0;
        int h=arr.length-1;
        int ans=-1;
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            if(arr[mid]==k)
            {
                ans=mid;
                break;
            }
            else if(arr[mid]>k)
            {
                ans=mid;
                h=mid-1;
            }
            else
            l=mid+1;
        }
        return ans;
    }
    public int rec(int ind,int n,int days[],int costs[],int dp[])
    {
        if(ind>days[n-1])
        return 0;
        if(dp[ind]!=-1)
        return dp[ind];

       // int take30=Integer.MAX_VALUE;
        int c = findceil(days,30+days[ind]);
        if(c==-1)
        c=days[n-1]+1;
        int take30=costs[2]+rec(c,n,days,costs,dp);

       // int take7=Integer.MAX_VALUE;
        c=findceil(days,7+days[ind]);
        if(c==-1)
        c=days[n-1]+1;
        int take7=costs[1]+rec(c,n,days,costs,dp);

        //int take1=Integer.MAX_VALUE;
        c=findceil(days,1+days[ind]);
        if(c==-1)
        c=days[n-1]+1;
        int take1=costs[0]+rec(c,n,days,costs,dp);
        return dp[ind]=Math.min(take1,Math.min(take7,take30));
    }
    public int mincostTickets(int[] days, int[] costs) {
        int dp[]=new int[366];
        Arrays.fill(dp,-1);
        return rec(0,days.length,days,costs,dp);
        
    }
}
