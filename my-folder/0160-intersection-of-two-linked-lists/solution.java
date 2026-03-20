/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution 
{
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode startA=headA;
        ListNode startB=headB;
        while(headA!=headB)
        {
            headA=(headA==null)?startB:headA.next;
            headB=(headB==null)?startA:headB.next;
        }
        return headA;  
    }
}
