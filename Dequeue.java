class Node {
    int data;
    Node prev, next;

    public Node(int data) {
        this.data = data;
        this.prev = this.next = null;
    }
}

class QueueDLL {
    private Node front, rear;

    public QueueDLL() {
        front = rear = null;
    }

    // Enqueue operation
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        newNode.prev = rear;
        rear = newNode;
    }

    // Dequeue operation
    public int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        int value = front.data;
        front = front.next;
        if (front != null) {
            front.prev = null;
        } else {
            rear = null;
        }
        return value;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Peek operation
    public int peek() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }
}

public class Dequeue {
    public static void main(String[] args) {
        QueueDLL queue = new QueueDLL();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Dequeued: " + queue.dequeue()); // Dequeued: 1
        System.out.println("Peek: " + queue.peek()); // Peek: 2
        System.out.println("Dequeued: " + queue.dequeue()); // Dequeued: 2
        System.out.println("Is queue empty? " + queue.isEmpty()); // Is queue empty? false
    }
}
