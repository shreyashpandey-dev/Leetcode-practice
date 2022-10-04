class Solution {
public:
    bool divideArray(vector<int>& nums) {
         int freq[501];
         for(int i=0;i<501;i++)
             freq[i]=0;
             
        for(int x:nums)
            freq[x]++;
        for(int x:freq)
            if(x%2!=0)
                return false;
         return true;
        
    }
};
