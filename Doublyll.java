class Doublyll{
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val=val;
        }
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static Node insertAthead(Node head, int x){
        Node dummy=new Node(x);
        dummy.next=head;
        head.prev=dummy;
        head=dummy;
        return head;
    }
    public static void main(String[] args) {
        Node a=new Node(9);
        Node b=new Node(10);
        Node c=new Node(11);
        Node d=new Node(12);
        Node e=new Node(13);
        Node f=new Node(14);

        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.next=b;
        c.next=d;
        d.prev=e;
        d.next=f;
        f.prev=e;
        f.next=null;

        display(a);
        Node newhead=insertAthead(a,30);
        display(newhead);
    }
}