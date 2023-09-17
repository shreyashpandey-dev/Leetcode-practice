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
    public ListNode mergeKLists(ListNode[] lists) {
        int k=lists.length;
        ListNode head=null,tail=null;
        PriorityQueue<ListNode>pq=new PriorityQueue<>((node1,node2)->Integer.compare(node1.val,node2.val));
        for(int i=0;i<k;i++)
        {
            if(lists[i]!=null)
            pq.add(lists[i]);
        }
        while(!pq.isEmpty())
        {
            ListNode node=pq.poll();
            if(head==null)
            {
                head=node;
                tail=node;
            }
            else
            {
                tail.next=node;
                tail=node;
            }
            if(node.next!=null)
            pq.add(node.next);
        }
        return head;
        
    }
}
