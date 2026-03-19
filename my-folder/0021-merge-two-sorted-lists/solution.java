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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head1=list1;
        ListNode head2=list2;
        if(head1==null || head2==null)
        {
            if(head1==null && head2==null)
            return null;
            if(head1==null)
            return head2;
            else
            return head1;
        }
        ListNode prev=null;
        while(list1!=null && list2!=null)
        {
            ListNode newHead;
            if(list1.val<list2.val)
            {
                newHead=list1;
                list1=list1.next;
            }
            else
            {
                newHead=list2;
                list2=list2.next;
            }
            if(prev!=null)
            prev.next=newHead;
            prev=newHead;
        }
            while(list1!=null)
            {
                ListNode newHead=list1;
                prev.next=newHead;
                prev=newHead;
                list1=list1.next;
            }
            while(list2!=null)
            {
                ListNode newHead=list2;
                prev.next=newHead;
                prev=newHead;
                list2=list2.next;
            }
            return head1.val<head2.val?head1:head2;
        
    }
}
