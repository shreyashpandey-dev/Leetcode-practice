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
 class Pair 
 {
     TreeNode node;
     int ind;
     Pair(TreeNode n,int i)
     {
         node=n;
         ind=i;
     }
 }
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair>q=new LinkedList<>();
        q.add(new Pair(root,0));
        int max=0;
        while(!q.isEmpty())
        {
            int size=q.size();
            int st=0,end=0;
            for(int i=0;i<size;i++)
            {
                Pair p=q.poll();
                TreeNode curr=p.node;
                int ind=p.ind;
                if(curr.left!=null)
                q.add(new Pair(curr.left,2*ind+1));
                if(curr.right!=null)
                q.add(new Pair(curr.right,2*ind+2));
                if(i==0)
                st=ind;
                if(i==size-1)
                end=ind;
                

            }
            max=Math.max(max,(end-st+1));
        }
        return max;
        
    }
}
