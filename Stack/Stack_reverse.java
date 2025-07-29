import java.util.Scanner;
import java.util.Stack;

public class Stack_reverse {
    public static void  InsertAtBottom(Stack<Integer>st, int x){
        if(st.size()==0){
            st.push(x);
            return;
        }
        int top=st.pop();
        InsertAtBottom(st, x);
        st.push(top);
    }
    public static void reverse(Stack<Integer> st){
        if(st.size()==1)return;
        int top=st.pop();
        reverse(st);
        InsertAtBottom(st,top);
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
        System.out.println("st:"+st);
        System.out.print("Reverse Stack by Recursion:");
        reverse(st);
        System.out.println(st);

        // copying reverse into rt 
        while(st.size()>0){
            rt.push(st.pop());
        }

        System.out.println("rt:"+rt);

        Stack<Integer> gt=new Stack<>();
        while(rt.size()>0){
            gt.push(rt.pop());
        }

        System.out.println("rt:"+gt);

        while(gt.size()>0){
            st.push(gt.pop());
        }

        System.out.println("st:"+st);



    }
}
