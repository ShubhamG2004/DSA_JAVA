import java.util.*;

class Question12 {

    Queue<Integer> q1;
    Queue<Integer> q2;

    public Question12() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        q1.offer(x);
    }

    public int pop() {

        while (q1.size() > 1) {
            q2.offer(q1.poll());
        }

        int ans = q1.poll();

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return ans;
    }

    public int top() {

        while (q1.size() > 1) {
            q2.offer(q1.poll());
        }

        int ans = q1.peek();
        q2.offer(q1.poll());

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return ans;
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}