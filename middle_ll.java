public class middle_ll{
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
    public static int size(Node head){
        Node temp=head;
        int size=0;

        while(temp!=null){
            size++;
            temp=temp.next;
        }
        return size;
    }
    public static Node deleteNthfromend(Node head, int idx){
        Node slow=head;
        Node fast =head;
        if (idx<0 || idx>=size(head)){
            return head;
        }
        for(int i=1;i<=idx;i++){
            fast=fast.next;
        }
        if(fast==null){
            head=head.next;
            return head;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }

        slow.next=slow.next.next;
        return head;
    }
    public static Node nthfromend2(Node head, int idx){
        Node slow=head;
        Node fast=head;

        for(int i=1;i<=idx;i++){
            fast=fast.next;
        }

        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }

        return slow;
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
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
        Node r= nthfromend2(a,2);
        System.out.println(r.data);
        display(a);
        System.out.println();
        a= deleteNthfromend(a,9);
        display(a);
    }
}