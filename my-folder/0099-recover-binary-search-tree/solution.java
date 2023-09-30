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
    TreeNode first=null;
    TreeNode mid=null;
    TreeNode last=null;
    TreeNode prev=new TreeNode(Integer.MIN_VALUE);
    public void swap(TreeNode a,TreeNode b)
    {
        int temp=a.val;
        a.val=b.val;
        b.val=temp;
    }
    public void inorder(TreeNode root)
    {
        if(root==null)
        return;
        inorder(root.left);
        if(prev.val>root.val && first==null)
        {
            first=prev;
            mid=root;
        }
        else if(prev.val>root.val)
        {
            last=root;
        }
        prev=root;
        inorder(root.right);
    }
    public void recoverTree(TreeNode root) {
        inorder(root);
        if(last==null)
        swap(first,mid);
        else
        swap(first,last);
    }
}
