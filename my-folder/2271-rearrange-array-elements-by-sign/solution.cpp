class Solution {
public:
    vector<int> rearrangeArray(vector<int>& nums) {
        int n=nums.size();
       vector<int>arr(n,0);
       int posind=0,negind=1;
        for(auto x:nums)
        {
            if(x>0)
            {
                arr[posind]=x;
                posind+=2;
            }
            else
            {
                arr[negind]=x;
                negind+=2;
            }
        }
        return arr;
    }
};
