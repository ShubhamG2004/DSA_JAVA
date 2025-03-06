import java.util.Scanner;

public class SelectionSort {
    public static void selectionSort(int[] arr, int n){
        for(int i=0;i<n-2;i++){
            int minPos = i; 
            for(int j=i+1;j<n-1;j++){
                if(arr[minPos]> arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the Elements:");
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are:");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        selectionSort(arr,n);
        System.out.println();
        System.out.println("Sorted elements are:");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
