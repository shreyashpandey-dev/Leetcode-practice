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
    TreeNode LCA;
    public boolean findlca(TreeNode root,int a,int b)
    {
        if(root==null)
        return false;
        boolean self=(root.val==a||root.val==b);
        boolean left=findlca(root.left,a,b);
        if(LCA!=null)
        return true;
        boolean right=findlca(root.right,a,b);
        if(LCA!=null)
        return true;
        if(self&&left||self&&right||left&&right)
        LCA=root;
        return self||left||right;

    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int a=p.val;
        int b=q.val;
        findlca(root,a,b);
        return LCA;


        
    }
}
