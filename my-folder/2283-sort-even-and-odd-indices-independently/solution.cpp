class Solution {
public:
    vector<int> sortEvenOdd(vector<int>& nums) {
       vector<int>a;
        vector<int>b;
       for(int i=0;i<nums.size();i++)
       {
           if(i%2!=0)
               a.push_back(nums[i]);
           else
               b.push_back(nums[i]);
       }
        int y=a.size();
        int z=b.size()-1;
        sort(a.begin(),a.end());
        sort(b.begin(),b.end());
        vector<int>v;
       int i=0;
        while(i<y)
        {
           v.push_back(b[i]);
            v.push_back(a[y-1-i]);
            i++;
        }
        if(nums.size()%2!=0)
            v.push_back(b[z]);
        
       
        
       
        
         return v;
    }
};

