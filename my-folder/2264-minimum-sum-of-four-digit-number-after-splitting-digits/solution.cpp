class Solution {
public:
    int minimumSum(int num) {
        vector<int>arr;
        arr.push_back(num%10);
        num/=10;
         arr.push_back(num%10);
        num/=10;
         arr.push_back(num%10);
        num/=10;
         arr.push_back(num%10);
        num/=10;
        sort(arr.begin(),arr.end());
        return (arr[0]*10+arr[2])+(arr[1]*10+arr[3]);
        
    }
};
