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
    public static Node insertAttail(Node head, int x){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }

        Node d=new Node(x);
        temp.next=d;
        d.prev=temp;
        temp=d;

        return head;
    }
    public static Node insertAtIdx(Node head, int idx, int x){
        Node s=head;
        for(int i=1;i<idx;i++){
            s=s.next;
        }
        Node r=s.next;
        Node t=new Node(x);
        s.next=t;
        t.prev=s;
        t.next=r;
        r.prev=t;

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
        Node newhead1=insertAttail(a,60);
        display(newhead1);

        Node newhead2=insertAtIdx(a, 3,1);
        display(newhead2);
    }
}