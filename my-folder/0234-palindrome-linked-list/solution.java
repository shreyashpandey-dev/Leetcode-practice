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
    ListNode prev=null;
    public void rev(ListNode curr)
    {
        while(curr!=null)
        {
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode st_prev=head;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            st_prev=slow;
            slow=slow.next;
        }
        st_prev.next=null;
        rev(slow);
        while(head!=null)
        {
            if(head.val!=prev.val)
            return false;
            head=head.next;
            prev=prev.next;
        }
        return true;

       
    }
}
