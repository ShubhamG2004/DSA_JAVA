public class NthNodeFromLast {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    } 
    static Node NthNodeFromEnd(Node head, int pos){
        Node temp = head;
        int size = 0;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        int nthNode = size - pos;
        if (pos <= 0 || pos > size) {
            return null;
        }
        Node res = head;
        for (int i = 0; i < nthNode; i++) {
            res = res.next;
        }

        return res;
    }

    static Node NthNodeFromEndOptimize(Node head, int pos){
        Node slow = head;
        Node fast = head;
        if (pos <= 0 ) {
            return null;
        }
        int i = 0;
        
        while (i < pos) {
            if (fast == null) {
                return null;
            }
            fast = fast.next;
            i++;
        }
        
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    static Node deleteNthNode(Node head, int pos){
        if (head == null || pos <= 0) return head;
        Node dummy = new Node(0);
        dummy.next = head;
        Node slow = dummy;
        Node fast = dummy;
        int i = 0;
        while (i < pos) {
            if (fast.next == null) return head;
            fast = fast.next;
            i++;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return dummy.next;
    }
    public static void main(String[] args) {
        Node a = new Node(12);
        Node b = new Node(10);
        Node c = new Node(9);
        Node d = new Node(4);
        Node e = new Node(6);
        Node f = new Node(11);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next =f;

        Node temp = NthNodeFromEnd(a,5);
        System.out.println();
        // 12 10 9 4 6 11
        System.out.println("Node: " + temp.data);

        Node sample = NthNodeFromEndOptimize(a,5);
        System.out.println();
        // 12 10 9 4 6 11
        System.out.println("Node: " + sample.data);

        Node delete = NthNodeFromEndOptimize(a,5);
        System.out.println();
        // 12 10 9 4 6 11
        
    }
}
