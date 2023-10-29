class Solution {
    public int findKOr(int[] nums, int k) {
       int sum = 0;
    for (int i = 0; i < 31; i++) {
        int cnt = 0;
        for (int num : nums) {
            if ((num & (1 << i)) != 0) {
                cnt++;
            }
             if (cnt == k) {
            sum += (1 << i);
                 break;
             }
        }
    }
    return sum;
    }
}
