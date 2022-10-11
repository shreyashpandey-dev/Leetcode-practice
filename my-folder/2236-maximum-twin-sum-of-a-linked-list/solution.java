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
    public ListNode rev(ListNode head)
    {
        ListNode prev=null,next=null,curr=head;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    } 
    public int pairSum(ListNode head) {
        ListNode temp=head;
        int n=0;
          while(temp!=null)
        {
           n++;
            temp=temp.next;
        }
        temp=head;
        int arr[]=new int[n];
        int i=0;
         while(i<n/2)
        {
           
            arr[i]=temp.val;
           
            temp=temp.next;
            i++;
        } 
        
        
       ListNode head1=rev(head);
        int maxi=-1;
        i=0;
        while(i<n/2)
        {
            int sum=arr[i]+head1.val;
            maxi=(int)Math.max(maxi,sum);
            head1=head1.next;
            i++;
        } 
        return  maxi;
    }
}
