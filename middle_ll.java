public class middle_ll {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    
    // Corrected left_node method
    public static Node left_node(Node head) {
        if (head == null) return null;
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Corrected right_node method
    public static Node right_node(Node head) {
        if (head == null) return null;
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(20);
        Node c = new Node(3);
        Node d = new Node(13);
        // Node e = new Node(8);
        a.next = b;
        b.next = c;
        c.next = d;
        // d.next = e;

        Node q = left_node(a);
        System.out.println("Left Middle Node: " + q.data);
        Node r = right_node(a);
        System.out.println("Right Middle Node: " + r.data);
        System.out.print("Linked List: ");
        display(a);
        System.out.println();
    }
}
