class Solution {
    public int largestRectangleArea(int[] heights) {

        int n = heights.length;
        int next[] = new int[n];
        int prev[] = new int[n];
        Stack<Integer> st = new Stack<>();

        // Next smaller
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i])
                st.pop();

            next[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        st.clear();

        // Previous smaller
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i])
                st.pop();

            prev[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        int max=0;

        for(int i=0;i<n;i++){
            int width = next[i]-prev[i]-1;
            max = Math.max(max, heights[i]*width);
        }

        return max;
    }
}
