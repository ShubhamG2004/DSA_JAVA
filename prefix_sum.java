import java.util.Scanner;

public class prefix_sum {

    static void printArray(int[] arr)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    static int[] pre_sum(int[] arr)
    {
        int n=arr.length;
        int[] pref=new int[n];
        pref[0]=arr[0];

        for(int i=1; i<n;i++)
        {
            pref[i]=pref[i-1]+arr[i];
        }
        return pref;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of array");
        int n=sc.nextInt();



        int[] arr=new int[n];
        System.out.println("Enter the Size "+n+"of array");

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        printArray(arr);

        int[] ans=pre_sum(arr);
        printArray(ans);
    }
}
