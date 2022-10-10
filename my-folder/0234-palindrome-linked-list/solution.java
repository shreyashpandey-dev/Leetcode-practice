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
    ListNode ref;
    public boolean check(ListNode head)
    {
        if(head==null)
            return true;
        boolean ans=check(head.next);
        boolean isEqual=(ref.val==head.val)?true:false;
        ref=ref.next;
        return ans && isEqual;
    }
    public boolean isPalindrome(ListNode head) {
      ref=head;
      return check(head);
    }
}
