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
    int max=0;
    public int diam(TreeNode root)
    {
        if(root==null)
        return 0;
        int lh=diam(root.left);
        int rh=diam(root.right);
        max=Math.max(max,(lh+rh));
        return Math.max(lh,rh)+1;  
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int y=diam(root);
        return max;
         
    }
}
