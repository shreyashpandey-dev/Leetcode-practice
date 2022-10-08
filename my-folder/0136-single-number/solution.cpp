class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int c=0;
       for(int x:nums)
          c^=x;
        return c;
    }
};
