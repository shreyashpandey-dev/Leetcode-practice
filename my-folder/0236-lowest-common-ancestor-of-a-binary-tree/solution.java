/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    TreeNode ans=null;
    public boolean lca(TreeNode root, TreeNode l1, TreeNode l2)
    {
        if(root==null)
        return false;
        boolean left=lca(root.left,l1,l2);
        if(ans!=null)
        return true;
        boolean right=lca(root.right,l1,l2);
        if(ans!=null)
        return true;
        boolean self=(root==l1||root==l2);
        if((left&self) || (right&&self) ||(left &&right))
        ans=root;
        return left||right||self;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        boolean res=lca(root,p,q);
        return ans;
        
    }
}
