import java.util.LinkedList;
import java.util.*;
public class CustomQueue {
    // Displaying the queue element using extra Queue
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        Queue<Integer> helper=new LinkedList<>();
        while(q.size()>0){
            System.out.print(q.peek()+" ");
            helper.add(q.poll());
        }
        System.out.println();
        
        while(helper.size()>0){
            q.add(helper.poll());
        }
        System.out.println(q);

    }
}
