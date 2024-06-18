import java.util.Scanner;
import java.util.Stack;

public class Stack_reverse {
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
