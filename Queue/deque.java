import java.util.*;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> q=new LinkedList<>();
        q.addLast(23);
        System.out.println("Deque:"+q);
        q.addLast(43);
        q.addLast(23);
        q.addLast(13);
        System.out.println("Queue:"+q);
        q.addFirst(10);
        System.out.println("Queue:"+q);

        System.out.println("First:"+q.getFirst());
        System.out.println("Queue:"+q.getLast());

    }
}
