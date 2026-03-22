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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode startNode=l1;
        ListNode n=null;
        int sum=0;
        int qu=0;
        ListNode prev=l1;
        while(l1!=null && l2!=null)
        {
            sum=qu+l1.val+l2.val;
            qu=sum/10;
            sum=sum%10;
            l1.val=sum;
            prev=l1;
            l1=l1.next;
            l2=l2.next; 
        }
        while(l2!=null)
        {
            //ListNode n=new ListNode();
            sum=qu+l2.val;
            qu=sum/10;
            sum=sum%10;
            l2.val=sum;
            prev.next=l2;
            prev=l2;
            l2=l2.next;
        }
        while(l1!=null)
        {
            sum=qu+l1.val;
            qu=sum/10;
            sum=sum%10;
            l1.val=sum;
            prev=l1;
            l1=l1.next;
        }
        if(qu!=0)
        n=new ListNode(qu);
        prev.next=n;
        return startNode;
        
    }
}
