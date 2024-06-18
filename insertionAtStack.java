import java.util.Scanner;
import java.util.Stack;

public class insertionAtStack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        Stack<Integer> rt=new Stack<>();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N:");
        int n=sc.nextInt();

        System.out.println("Enter Element:");
        for(int i=1;i<=n;i++){
            int a=sc.nextInt();
            st.push(a);
        }
        System.out.println(st);

        int idx=2;
        int val=23;

        while(st.size()>2){
            rt.push(st.pop());
        }
        st.push(val);
        while (rt.size()>0) {
            st.push(rt.pop());
        }
        System.out.println(st);
    }   
}
