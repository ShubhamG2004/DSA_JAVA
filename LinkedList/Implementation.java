public class Implementation {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void displayLL(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
    }
    public static int listLength(Node head){
        int count = 0;
        Node temp = head;
        while (temp!=null) {
            count++;
            temp=temp.next;
        }
        return count;
    }
    public static int recLength(Node head){
        if (head == null) {
            return 0;
        }
        return 1 + recLength(head.next);
    }
    public static void recDisplayLL(Node head){
        Node temp =head;
        if(temp==null){
            return;
        }
        System.out.println(temp.data);
        recDisplayLL(temp.next);
    }
    public static class LinkedList{
        Node head = null;
        Node tail = null;

        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
                tail = temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }
        }
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(10);

        
    }
}
