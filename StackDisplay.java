import java.util.Scanner;
import java.util.Stack;

public class StackDisplay {
    public static void Displayrev(Stack<Integer> st){
        if (st.isEmpty()) return;
        int top = st.pop();
        System.out.print(top + " ");
        Displayrev(st);
        st.push(top);
    }
    public static void Displayrec(Stack<Integer> st) {
        if (st.isEmpty()) return;
        int top = st.pop();
        Displayrec(st);
        System.out.print(top + " ");
        st.push(top);
    }
    public static void InsertAtBot(Stack<Integer> st,int val) {
        if (st.isEmpty()) {
            st.push(val);
            return;
        }
        int top = st.pop();
        InsertAtBot(st,val);
        // System.out.print(top + " ");
        st.push(top);
    }
    
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
        System.out.println();

        //Printing by using the Another Stack
        while(st.size()>0){
            rt.push(st.pop());
        }
        System.out.print("Displaying the Value By using the Stack:");
        while (rt.size()>0) {
            System.out.print(+st.push(rt.pop())+" ");
        }
        System.out.println();

        System.out.print("Displaying the Value By using the Array:");
        int c=st.size();
        int[] arr=new int[c];
        for(int i=c-1;i>=0;i--){
            arr[i]=st.pop();
        }
        for(int i=0;i<n;i++){
            System.out.print(st.push(arr[i])+" ");
        }  

        System.out.println();
        System.out.print("Displaying the Value Reverse By using the Recursion:");
        Displayrev(st);
        
        System.out.println();
        System.out.print("Displaying the Value Reverse By using the Recursion:");
        Displayrec(st);

        System.out.println(st);
        System.out.print("Displaying the Value Reverse By using the Recursion:");
        InsertAtBot(st,23);
        System.out.println(st);

    }
}
