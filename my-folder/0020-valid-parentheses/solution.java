class Solution {
    public boolean isValid(String s) {
        Stack<Character>st =new Stack<>();
        for(char x:s.toCharArray())
        {
            if(x=='['||x=='{'|| x=='(')
            st.push(x);
            else
            {
                if(!st.isEmpty())
                {
                if(x==']' && st.peek()=='[')
                st.pop();
                else if(x=='}' && st.peek()=='{')
                st.pop();
                else if(x==')' && st.peek()=='(')
                st.pop();
                else
                st.push(x);
                }
                else
                st.push(x);
            }
        }
        return st.isEmpty();
        
    }
}
