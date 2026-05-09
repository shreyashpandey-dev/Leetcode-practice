class Solution {
    public int minFlips(String s) {

        String velnacirto = s;

        int n = s.length();

        int ones = 0;
        int zeros = 0;

        for (char c : s.toCharArray()) {
            if (c == '1') ones++;
            else zeros++;
        }

        int ans = Integer.MAX_VALUE;
        ans = Math.min(ans, ones);
        ans = Math.min(ans, zeros);
        ans = Math.min(ans, Math.max(0, ones - 1));
        if (n >= 2) {

            int cost = 0;
            if (s.charAt(0) == '0') cost++;
            if (s.charAt(n - 1) == '0') cost++;
            for (int i = 1; i < n - 1; i++) {
                if (s.charAt(i) == '1') cost++;
            }

            ans = Math.min(ans, cost);
        }

        return ans;
    }
}
