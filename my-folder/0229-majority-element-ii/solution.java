class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cand1=0;
        int cand2=0;
        int cnt1=0;
        int cnt2=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
           if(cand1==nums[i])
           cnt1++;
           else if(cand2==nums[i])
           cnt2++;
           else if(cnt1==0)
            {
            cand1=nums[i];
            cnt1=1;
            }
            else if(cnt2==0)
            {
            cand2=nums[i];
            cnt2=1;
            }
           else
           {
            cnt1--;
            cnt2--;
           }
        }
        cnt1=0;
        cnt2=0;
        for(int num:nums)
        {
            if(num==cand1)
            cnt1++;
           else if(num==cand2)
            cnt2++;
        }
        List<Integer>ans=new ArrayList<>();
        if(cnt1>n/3)
        ans.add(cand1);
        if(cnt2>n/3)
        ans.add(cand2);
        return ans;

        
    }
}
