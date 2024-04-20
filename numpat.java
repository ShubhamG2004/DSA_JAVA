import java.util.Scanner;

public class numpat {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the N:");
        int n = sc.nextInt();

        int c= sc.nextInt();

       

        for(int i=1;i<=n;i++)
        {
             for(int b=1;b<=n-i;b++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            
           System.out.println("");
 
        }
    }
}
