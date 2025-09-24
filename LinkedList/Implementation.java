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
    public static void main(String[] args) {
        Node a = new Node(12);
        Node b = new Node(10);
        Node c = new Node(9);
        Node d = new Node(4);
        Node e = new Node(6);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        displayLL(a);
        System.out.println("Recursive");
        displayLL(a);

        int lenLl = listLength(a);
        System.out.println();
        System.out.println("Length of List:: "+ lenLl); 

        System.out.println();
        int lenL = recLength(a);
        System.out.println("Length of List Reverse:: "+ lenL); 
    }
}
