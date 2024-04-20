import java.util.Scanner;

public class Selection_Sort{

    static void selection(int[] arr, int n)
    {
        for(int i=0;i<n-1;i++)
        {
            int min_index=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;   
        }
    }

    public static void main(String[] args) {
        int arr[]=new int[50];
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number of Elements");
        int n = sc.nextInt();

        System.out.println("Enter the Elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Array Elements:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        selection(arr, n);
        System.out.println("Array Elements:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
}