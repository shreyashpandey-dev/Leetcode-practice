class Solution {
    public boolean isValid(String s) {
        char ch[]=s.toCharArray();
        Stack<Character>st=new Stack<>();
        for(int i=0;i<ch.length;i++)
        {
            char op=ch[i];
            if(op=='{'||op=='('||op=='[')
            st.push(ch[i]);
            else
            {
                if(st.isEmpty())
                return false;
               if(op=='}')
               {
                   if(st.peek()=='{')
                   st.pop();
                   else
                   return false;
               }
              else if(op==']')
               {
                   if(st.peek()=='[')
                   st.pop();
                   else
                   return false;
               }
               else if(op==')')
               {
                   if(st.peek()=='(')
                   st.pop();
                   else
                   return false;
               }
            }
        }
        return st.isEmpty();
        
    }
}
