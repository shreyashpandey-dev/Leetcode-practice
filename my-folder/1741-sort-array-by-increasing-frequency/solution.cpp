class Solution {
public:
   static bool cmp(vector<int>a,vector<int>b)
    {
        if(a[0]<b[0])
        return true;
        if(a[0]==b[0])
            return a[1]>b[1];
        return false;    
    }
    vector<int> frequencySort(vector<int>& nums) {
        map<int, int> cnt;
        for ( auto u : nums ) cnt[u]++;
        vector<vector<int>> v;
        
        for(auto u : cnt) v.push_back({u.second, u.first});
        sort(v.begin(), v.end(),cmp);
        
        vector<int> ans;
        for ( auto u : v ) {
            for ( int i = 0; i < u[0]; i++ ) ans.push_back ( u[1] );
        }
        
        return ans;
    }
};
