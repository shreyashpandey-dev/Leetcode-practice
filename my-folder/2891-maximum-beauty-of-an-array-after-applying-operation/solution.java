class Pair
{
    int start;
    int end;
    Pair(int st,int en)
    {
        start=st;
        end=en;
    }
}
class Solution {
    
    public int maximumBeauty(int[] nums, int k) {
        for(int i=0;i<nums.length;i++)
            nums[i]=nums[i]+k;
        Arrays.sort(nums);
        Pair arr[]=new Pair[nums.length];
        for(int i=0;i<arr.length;i++)
        {
            int st=nums[i]-k;
            int en=nums[i]+k;
            Pair p=new Pair(st,en);
            arr[i]=p;
        }
        int ans[]=new int[nums[nums.length-1]+k+2];
        for(int i=0;i<arr.length;i++)
        {
            ans[arr[i].start]++;
            ans[arr[i].end+1]--;
        }
        int cnt=0, max=Integer.MIN_VALUE;
        for(int i=0;i<ans.length;i++)
        {
            cnt+=ans[i];
            if(cnt>max)
                max=cnt;
        }
        return max;
        
        
    }
}
