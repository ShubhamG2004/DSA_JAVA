public class llnthfromend{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static Node nthfromend(Node head, int idx){
        Node temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }

        int m=size-idx+1;
        temp=head;
        for(int i=1;i<=m-1;i++){
            temp=temp.next;
        }

        return temp;
    }
    public static void main(String[] args) {
        Node a=new Node(100);
        Node b=new Node(20);
        Node c=new Node(3);
        Node d=new Node(13);
        Node e=new Node(8);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        Node q= nthfromend(a,2);
        System.out.println(q.data);
    }
}