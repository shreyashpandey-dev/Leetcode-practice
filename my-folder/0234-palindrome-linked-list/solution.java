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
    public boolean comp(ListNode revHead,ListNode slow)
    {
        while(slow!=null)
        {
            if(revHead.val!=slow.val)
            return false;
            slow=slow.next;
            revHead=revHead.next;
        }
        return true;
    }
    public ListNode rev(ListNode head)
    {
        //base cond
        if(head==null ||head.next==null)
        return head;
        ListNode revHead=rev(head.next);
        head.next.next=head;
        head.next=null;
        return revHead;
    }
    public boolean isPalindrome(ListNode head) {
        //approach -> find mid , revHead=rev(head) comp(revHead,slow)
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        if(head.next==null)
        return true;
        while(fast!=null&& fast.next!=null)
        {
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;
        ListNode revHead=rev(head);
        if(fast!=null)
        slow=slow.next;
        return comp(revHead,slow);
        
    }
}
