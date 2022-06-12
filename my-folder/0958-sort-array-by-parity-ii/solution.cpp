class Solution {
public:
    vector<int> sortArrayByParityII(vector<int>& nums) {
        int arr[nums.size()];
        int i=0,j=1;
        for(int x:nums)
        {
            if(x%2==0)
            {
                arr[i]=x;
                i=i+2;
            }
            else
            {
                arr[j]=x;
                j=j+2;
            }
        }
        vector<int>p;
        for(int x:arr)
            p.push_back(x);
        return p;
            
    }
};
