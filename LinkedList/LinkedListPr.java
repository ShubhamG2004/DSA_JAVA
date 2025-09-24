public class LinkedListPr {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    } 
    public static class LinkedList{
        Node head= null;
        Node tail = null;

        int listLength(){
            int count = 0;
            Node temp = head;
            while (temp!=null) {
                count++;
                temp=temp.next;
            }
            return count;
        }

        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head== null){
                head= temp;
            }
            else{
                tail.next = temp;
            }
            tail = temp;
        }

        void insertAtFirst(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
                tail = temp;
            }
            else{
                temp.next = head;
                head = temp;
            }
        }
        void insertAtMiddle(int pos, int val){
            Node temp = new Node(val);
            Node dummy = head;

            if(pos == 0 || head == null){
                insertAtFirst(val);
                return;
            }
            
            int i = 0;
            while(i < pos - 1 && dummy.next != null){
                dummy = dummy.next;
                i++;
            }
            
            temp.next = dummy.next;
            dummy.next = temp;
            
            if(temp.next == null){
                tail = temp;
            }
            
        }

        void deleteAt(int pos){
            if (head == null || pos < 0 || pos >= listLength()) {
                return;
            }
            if (pos == 0) {
                head = head.next;
                if (head == null) {
                    tail = null;
                }
                return;
            }
            Node temp = head;
            for (int i = 0; i < pos - 1; i++) {
                if (temp == null || temp.next == null) {
                    return;
                }
                temp = temp.next;
            }
            if (temp.next == null) {
                return;
            }
            if (temp.next.next == null) {
                temp.next = null;
                tail = temp;
            } else {
                temp.next = temp.next.next;
            }
        }

        void displayLL(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+ " ");
                temp = temp.next;
            }
        }

        int getElement(int pos){
            Node temp = head;

            if(pos == 0){
                return head.data;
            }
            else if(pos == listLength()){
                return tail.data;
            } 
            else if( pos < 0|| pos > listLength()){
                return -1;
            }

            // 13 -> 10 -> 20 -> 12 -> 11
            // 0     1      2   3      4
            for(int i=0;i<pos-1;i++){
                temp = temp.next;
            }

            return temp.data;
        }
    }
    
    public static void main(String[] args) {
        LinkedList ll =new LinkedList();
        ll.insertAtEnd(10);
        ll.insertAtEnd(12);
        ll.insertAtEnd(11);

        ll.insertAtFirst(13);

        ll.insertAtMiddle(3,20);

        ll.displayLL();

         // To get Particular Node of the LinkedList
        int getData = ll.getElement(-1);
        System.out.println();
        System.out.println("Value at 3: "+ getData);

        ll.deleteAt(5);
        ll.displayLL();
    }
}
