import java.util.*;
public class Stack_imp {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        Stack<Integer> rt=new Stack<>();
        Stack<Integer> gt=new Stack<>();
        // st.push(10);
        // System.out.println(st.peek());
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N:");
        int n=sc.nextInt();

        System.out.println("Enter Element:");
        for(int i=1;i<=n;i++){
            int a=sc.nextInt();
            st.push(a);
        }
        System.out.println(st);

        while(st.size()>0){
            rt.push(st.pop());  
        }
        while(rt.size()>0){
            gt.push(rt.pop());  
        }
        System.out.println("ft:"+gt);
    }
}
