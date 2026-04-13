import java.util.Scanner;

public class Insertion {
    public static void main(String[] args) {
        int arr[]=new int[50];
        System.out.println("Enter The Element Values:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        System.out.println("Enter the Values:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Elements of the Array");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
