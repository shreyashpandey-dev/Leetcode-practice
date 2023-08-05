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
     int gcd(int a, int b)
    {
        // if b=0, a is the GCD
        if (b == 0)
            return a;
 
     
        else
            return gcd(b, a % b);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp=head;
        while(temp.next!=null)
        {
            int a=temp.val;
            int b=temp.next.val;
            int res=gcd(a,b);
            ListNode newNode =new ListNode(res);
            ListNode next=temp.next;
            temp.next=newNode;
            newNode.next=next;
            temp=next;
            
        }
        return head;
    }
}
