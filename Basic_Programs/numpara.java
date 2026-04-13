import java.util.Scanner;

public class numpara {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the c:");

        int r=sc.nextInt();
        for(int i=1;i<=r;i++)
        {
            for(int k=1;k<=r-i;k++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            for(int b=i-1;b>=1;b--)
            {
                System.out.print(b+" ");
            }
            System.out.println();
        }
        
    }
}
