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
class Solution {
    public ListNode rev(ListNode head,ListNode prev)
    {
        if(head==null)
            return prev;
        ListNode next=head.next;
        head.next=prev;
        return rev(next,head);
    }
    public ListNode reverseList(ListNode head) {
     /*   ListNode prev=null,next=null;
        ListNode curr=head;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev; */
        return rev(head,null);
        
    }
}
