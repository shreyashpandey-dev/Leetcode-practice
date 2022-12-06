/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode arrtobst(int[]arr,int l,int h)
    {
        if(l>h)
        return null;
        int mid=l+(h-l)/2;
        TreeNode node=new TreeNode(arr[mid]);
        node.left=arrtobst(arr,l,mid-1);
        node.right=arrtobst(arr,mid+1,h);
        return node;
    }
    public TreeNode sortedListToBST(ListNode head) {
        ListNode curr=head;
        int c=0;
       while(curr!=null)
       {
           c++;
           curr=curr.next;
       } 
       int arr[]=new int[c];
       int i=0;
       curr=head;
       while(curr!=null)
       {
        arr[i]=curr.val;
        curr=curr.next;
        i++;
       }
       int l=0,h=arr.length-1;
      return arrtobst(arr,l,h);
    }
}
