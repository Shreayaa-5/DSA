class MyLinkedList {
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        }
    }
    private Node head;
    public MyLinkedList() {
        this.head=null;
    }
    
    public int get(int index) {
        Node curr=head;
        while(index>0){
            if(curr==null) return -1;
            curr=curr.next;
            index--;
        }
        return (curr==null)?-1:curr.val;
    }
    
    public void addAtHead(int val) {
        Node nod=new Node(val);
        nod.next=head;
        head=nod;
    }
    
    public void addAtTail(int val) {
        Node n=new Node(val);
        if(head==null){
            head=n;
            return;
        }
        Node curr=head;
        while (curr.next!=null){
            curr=curr.next;
        }
        curr.next=n;
    }
    
    public void addAtIndex(int index, int val) {
        Node n=new Node(val);
        Node curr= head;
        int count=index-1;
        if(index==0){
            addAtHead(val);
            return ;
        }
        while(count!=0 && curr!=null){
            count-=1;
            curr=curr.next;
        }
        if (curr == null) return;
        Node temp=curr.next;
        curr.next=n;
        n.next=temp;

    }
    
    public void deleteAtIndex(int index) {
        if (head == null) return;
        Node curr=head;
        if(index==0){
            head=head.next;
            return ;
        }
        int count=index-1;
        while(count!=0 && curr!=null){
            count--;
            curr=curr.next;
        }
        if (curr == null || curr.next == null) return;
        curr.next=curr.next.next;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */