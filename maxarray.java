import java.util.Scanner;

public class maxarray {
   public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    
    System.out.println("Enter the Element:");
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    System.out.println("Element");
    for(int i=0;i<arr.length;i++)
    {
        System.out.print(arr[i]+" ");
    }
    int max=arr[0];
    System.out.println();
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]>max){
            max=arr[i];
        }
    }
    System.out.println("Max"+max);
   }
}
