import java.util.*;
public class ReverseKele {
    private static void revkrev(Queue<Integer> q, int k) {
        // 20, 40, 30, 50, 60, 70, 80
        
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<k;i++){
            st.push(q.poll());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        for (int i = 0; i < q.size() - k; i++) {
            q.add(q.poll());
        }
        
    }
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        System.out.println(q);
        revkrev(q, 3);
        System.out.println(q);
        

        
    }
    // private static void revkrev(Queue<Integer> q, int i) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'revkrev'");
    // }
}
