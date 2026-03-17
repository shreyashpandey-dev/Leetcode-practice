class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int nextG[]=new int[n];
        int prevG[]=new int[n];
        Stack<Integer> st =new Stack<>();
        //next Greater
        for(int i=n-1;i>=0;i--)
        {
            while(!st.isEmpty() && height[i]>=height[st.peek()])
            {
                st.pop();
            }
            nextG[i]=st.isEmpty()?-1:st.peek();
            if(!st.isEmpty() && height[i]>=height[st.peek()]) 
            st.push(i);
            else if (st.isEmpty())
            st.push(i);
        }
        st.clear();
        //previous Greater
        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty() && height[i]>=height[st.peek()])
            st.pop();
            prevG[i]=st.isEmpty()?-1:st.peek();
            if(!st.isEmpty() && height[i]>=height[st.peek()]) 
            st.push(i);
            else if (st.isEmpty())
            st.push(i);
        }
        int area=0;
        System.out.println(Arrays.toString(nextG));
         System.out.println(Arrays.toString(prevG));
        for(int i=0;i<n;i++)
        {
            if(nextG[i]!=-1 && prevG[i]!=-1)
            area+=Math.min(height[nextG[i]],height[prevG[i]])-height[i];
            System.out.println("i="+i+" area="+area);
        }
        return area;

        
    }
}
