public class QueueByArray {

    public class QueueA {
        int[] arr = new int[10];
        int front = -1;
        int rear = -1;
        int size = 0;

        public void add(int val) {
            if (rear == arr.length - 1) {
                System.out.println("Queue is full");
                return;
            }
            if (front == -1) front = 0;
            arr[++rear] = val;
            size++;
        }

        public int remove() {
            if (front == -1 || front > rear) {
                System.out.println("Queue is empty");
                return -1;
            }
            int x = arr[front++];
            size--;
            if (front > rear) {
                front = rear = -1; // Reset queue when empty
            }
            return x;
        }

        public int peek() {
            if (front == -1 || front > rear) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }

        public int size() {
            return size;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public void display() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        QueueByArray outer = new QueueByArray();
        QueueA q = outer.new QueueA();
        q.add(20);
        q.add(50);
        q.add(60);

        q.display(); // Display the queue elements

        System.out.println("Removed element: " + q.remove()); 
        System.out.println("Peek element: " + q.peek()); 

        q.display(); 
    }
}
