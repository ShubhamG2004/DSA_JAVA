import java.util.Scanner;
import java.util.Stack;

public class StackDisplay {
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

        //Printing by using the Another Stack
        
    }
}
