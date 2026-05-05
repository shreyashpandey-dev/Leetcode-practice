class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        char[] res = new char[n];

        for (int i = 0; i < n; i++) {
            char ch = nums[i].charAt(i);
            res[i] = (ch == '0') ? '1' : '0';
        }
        return new String(res);
        
    }
}
