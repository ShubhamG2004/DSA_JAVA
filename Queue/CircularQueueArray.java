public class CircularQueueArray {
    public static class CirQueue {
        int size = 0;
        int front = -1;
        int rear = -1;
        int[] arr = new int[8];
        int n = arr.length;

        public void add(int x) {
            if (size == 0) {
                front = rear = 0;
                arr[rear] = x;
                size++;
            } else if (size == n) {
                System.out.println("QUEUE IS FULL");
                return;
            } else {
                rear = (rear + 1) % n;
                arr[rear] = x;
                size++;
            }
        }

        public int remove() {
            if (size == 0) {
                System.out.println("Empty");
                return -1;
            }
            int val = arr[front];
            front = (front + 1) % n;
            size--;
            return val;
        }

        public int peek() {
            if (size == 0) {
                return -1;
            }
            return arr[front];
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public void display() {
            if (size == 0) {
                System.out.println("Empty!!");
                return;
            }
            if (front <= rear) {
                for (int i = front; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
            } else {
                for (int i = front; i < n; i++) {
                    System.out.print(arr[i] + " ");
                }
                for (int i = 0; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CirQueue c = new CirQueue();
        c.display();
        c.add(10);
        c.display();
        c.add(20);
        c.add(30);
        c.add(40);
        c.display();
        System.out.println(c.remove());
        c.display();
        c.add(50);
        c.display();
        System.out.println(c.peek());
    }
}
