class Solution {
public:
    vector<int> sortArrayByParity(vector<int>& nums) {
       vector<int>arr;
        for(int x:nums)
        {
            if(x%2==0)
                arr.push_back(x);
        }
        for(int x:nums)
        {
            if(x%2!=0)
            arr.push_back(x);
        }
        return arr;
        
    }
};
