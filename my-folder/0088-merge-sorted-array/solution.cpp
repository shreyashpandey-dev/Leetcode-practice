class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int i=0, j=0,k=0;
        int arr[m+n];
       while(i<m && j<n)
       {
           if(nums1[i]<nums2[j])
           {
               arr[k]=nums1[i];
               i++;
               k++;
               
           }
           else
           {
               arr[k]=nums2[j];
               j++;
               k++;
           }
       }
        while(j<n)
        {
            arr[k]=nums2[j];
            j++;
            k++;
        }
        while(i<m)
        {
            arr[k]=nums1[i];
            k++;
            i++;
        }
        for(int i=0;i<m+n;i++)
        {
            nums1[i]=arr[i];
        }
        
    }
};
