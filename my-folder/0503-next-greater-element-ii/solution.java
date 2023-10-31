class Solution {
    public int[] nextGreaterElements(int[] arr) {
        Stack<Integer>st=new Stack<>();
        
        int n=arr.length;
        for(int i=n-2;i>=0;i--)
           st.add(arr[i]);
        for(int i=n-1;i>=0;i--)
        {
            while(!st.isEmpty()&& st.peek()<=arr[i])
            st.pop();
            int temp=arr[i];
            arr[i]=st.isEmpty()?-1:st.peek();
            st.add(temp);
        }
        return arr;
        
    }
}
