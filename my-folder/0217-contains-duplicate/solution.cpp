class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        unordered_set<int>x;
        for(int i=0;i<nums.size();i++)
            x.insert(nums[i]);
        if(x.size()==nums.size())
            return false;
        else
            return true;
        
    }
};
