class Node
{
    int data;
    int min;
    Node(int d,int m)
    {
        data=d;
        min=m;
    }
}
class MinStack {
    Stack<Node>st;

    public MinStack() {
        st=new Stack<Node>(); 
    }
    
    public void push(int val) {
       if(st.isEmpty())
       st.push(new Node(val,val));
       else
       st.push(new Node(val,Math.min(st.peek().min,val)));
    }
    
    public void pop() {
        st.pop();
        
    }
    
    public int top() {
        return st.peek().data;
        
    }
    
    public int getMin() {
        return st.peek().min;  
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
