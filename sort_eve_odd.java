import java.util.Scanner;

public class sort_eve_odd {

    static void printArray(int[] arr)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    static void swap_array(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    static void sort_ze_on(int[] arr)
    {
        int n=arr.length;
        int left=0;
        int right=n-1;
        while  (left<right)
        {
            if(arr[left]%2==1 & arr[right]%2==0)
            {
                swap_array(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]%2==0)
            {
                left++;
            }
            if(arr[right]%2==1)
            {
                right--;
            }
        }
    }

     public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the Size:");
            int n=sc.nextInt();
            int[] arr=new int[n];

            System.out.println("Enter the Element:");
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            System.out.println("Original Array:");
            printArray(arr);

            sort_ze_on(arr);

            System.out.println("Sorted Array:");
            printArray(arr);
        }
     }
}
