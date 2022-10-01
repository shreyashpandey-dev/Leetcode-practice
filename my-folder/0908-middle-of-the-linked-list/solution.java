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
    public ListNode middleNode(ListNode head) {
          ListNode temp=head;
        int c=0;
         while(head!=null)
         {
             head=head.next;
             c++;
         }
             int r=c/2;
             while(r!=0)
             {
                 temp=temp.next;
                 r--;
             }
            return temp;
        
    }
}
