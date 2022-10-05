class Solution {
public:
    static int n_of1(int z)
    {
        int c=0;
        while(z)
        {
            z&=z-1;
            c++;
        }
        return c;
    }
    static bool compare(int a,int b)
    {
        int x=n_of1(a);
        int y=n_of1(b);
        if(x==y)
            return a<=b;
        return x<y;
    }
    vector<int> sortByBits(vector<int>& arr) {
       sort(arr.begin(),arr.end(),compare);
       return arr;
    }
};
