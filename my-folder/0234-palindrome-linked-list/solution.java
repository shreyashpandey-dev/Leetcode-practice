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
     ListNode reverse(ListNode head)
    {
        ListNode prev=null,next=null;
        ListNode curr=head;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
      ListNode start=head;
        ListNode temp=head;
        ListNode end=head;
        int c=1;
        while(end.next!=null)
        {
            end=end.next;
            c++;
        }
        
        int d=c/2;
        while(d!=0)
        {
            temp=temp.next;
            d--;
        }
        d=c/2;
        ListNode end1=reverse(temp);
        while(d!=0)
        {
            if(start.val==end1.val)
            {
                start=start.next;
                end1= end1.next;
            }
            else
            {
                return false;
                
            }
            d--;
        }
        return true;   
    }
}
