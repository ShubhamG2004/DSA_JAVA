import java.util.Scanner;

public class Countsort {
    static void countingSort(int[] arr, int n){
        int max= Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max = Math.max(arr[i], max);
        }

        int count[] = new int[max+1];

        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }

        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
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
        countingSort(arr,n);
        System.out.println();
        System.out.println("Sorted elements are:");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
