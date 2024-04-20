public class LinkedListInsertAtPosition{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static class LinkedList{
        Node head=null;
        Node tail=null;

        void insertAtEnd(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;
        }
        void insertAtBegin(int val){
            Node temp=new Node(val);

            if(head==null){
                head=tail=temp;
            }
            else{
                temp.next=head;
                head=temp;
            }
        }
        void insertAtPosition(int idx, int val){
            Node iap=new Node(val);
            Node temp=head;

            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            iap.next=temp.next;
            temp.next=iap;
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.insertAtEnd(5);
        ll.insertAtEnd(8);
        ll.display();
        System.out.println();
        ll.insertAtBegin(7);
        ll.display();
        System.out.println();
        ll.insertAtPosition(2, 11);
        ll.display();
    }
}