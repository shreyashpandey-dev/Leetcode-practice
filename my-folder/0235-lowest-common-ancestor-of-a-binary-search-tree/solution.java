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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int small=p.val>q.val?q.val:p.val;
        int large=small==p.val?q.val:p.val;
        while(root!=null)
        {
            if(root.val>=small && root.val<=large)
            return root;
            else if(root.val>large)
            {
                root=root.left;
            }
            else if(root.val<small)
            {
                root=root.right;
            }
        }
        throw null;
        
    }
}
