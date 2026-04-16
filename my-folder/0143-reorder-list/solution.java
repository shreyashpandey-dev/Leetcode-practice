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
    public void reorderList(ListNode head) {
        HashMap<ListNode,ListNode>map=new HashMap<>();
        ListNode ptr=head;
        ListNode end=ptr;
        ListNode next=null;
        ListNode start=head;
        while(ptr!=null)
        {
            next=ptr.next;
            if(ptr==head)
            map.put(head,null);
            else
            {
            map.put(next,ptr);
            }
            end=ptr;
            ptr=next;
        }
        boolean pattern =true;
        while(head!=end)
        {
            next=head.next;
            if(pattern==true)
            {
            head.next=end;
            pattern=false;
            head=next;
            }
            else
            {
            end.next=head;
            pattern=true;
            end=map.get(end);
            }
        }
        end.next=null;
        
    }
}
