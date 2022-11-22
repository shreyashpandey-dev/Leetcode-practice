/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void trav(TreeNode root) 
        {
        Queue<TreeNode>q,q1; 
        q=new LinkedList<TreeNode>(); 
        q1=new LinkedList<TreeNode>(); 
   Stack<Integer>st=new Stack<>();     
        q.add(root); 
        boolean rev=false; 
        while(!q.isEmpty())
            {
            int cnt=q.size(); 
            for(int i=0; i<cnt;i++) 
                {
                TreeNode curr=q.poll();
                if(rev) 
                    {
                    st.push(curr.val);
                    q1.add(curr); 
                    }
                if(curr.left!=null) 
                    {
                    q.add(curr.left);
                    }
                if(curr.right!=null)
                    q.add(curr.right); 
                } 
            if(rev) 
                {
                while(!q1.isEmpty()) 
                    { 
                    TreeNode c=q1.poll(); 
                    c.val=st.pop(); 
                    }
                }
            rev=!rev;} }
    public TreeNode reverseOddLevels(TreeNode root) {
        trav(root); 
        return root;
    }
}
