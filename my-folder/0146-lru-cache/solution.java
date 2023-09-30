class Node
{
    int key,val;
    Node prev,next;
    Node(int k,int v)
    {
        key=k;
        val=v;
    }
}
class LRUCache {
    int c;
    Node head=new Node(0,0);
    Node tail=new Node(0,0);
    HashMap<Integer,Node>h=new HashMap<>();
    public LRUCache(int capacity) {
        c=capacity;
        head.next=tail;
        tail.prev=head;

    }
    public void insert(Node node)
    {
        h.put(node.key,node);
        node.next=head.next;
        node.prev=head;
        head.next.prev=node;
        head.next=node;
    }
    public void remove(Node node)
    {
        h.remove(node.key);
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
    
    public int get(int key) {
        if(h.containsKey(key))
        {
            Node node=h.get(key);
            remove(node);
            insert(node);
            return node.val;
        }
        return -1;
        
    }
    
    public void put(int key, int value) {
        if(h.containsKey(key))
        {
            remove(h.get(key));
        }
        else if(h.size()==c)
        {
            remove(tail.prev);
        }
        Node node=new Node(key,value);
        insert(node);
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
