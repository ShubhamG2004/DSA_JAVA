import java.util.Scanner;

public class InsertSort {
    // 9 8 7 6 5 4
    // 9 9 8 6 5 4
    static void insertionSort(int[] arr, int n){
        for(int i=1;i<n;i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev >=0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }

            arr[prev+1] = curr;
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
        insertionSort(arr,n);
        System.out.println();
        System.out.println("Sorted elements are:");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
