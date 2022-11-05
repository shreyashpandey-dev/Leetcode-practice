class Solution {
public:
    int max(int a,int b)
    {
        if(a<b)
            return b;
        return a;
    }
    int largestRectangleArea(vector<int>& arr) {
        int n=arr.size();
        int res=0,curr;
        stack<int>s;
        for(int i=0;i<n;i++)
        {
            while(!s.empty() && arr[s.top()]>=arr[i])
            {
                int t=s.top();
                s.pop();
                curr=arr[t]*(s.empty()?i:i-s.top()-1);
                res=max(res,curr);
            }
            s.push(i);
        }
        while(!s.empty())
        {
            int t=s.top();
            s.pop();
            curr=arr[t]*(s.empty()?n:n-s.top()-1);
            res=max(res,curr);
        }
        return res; 
    }
};
