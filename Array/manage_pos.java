import java.util.Scanner;

public class manage_pos {
    static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void partition(int[] arr) {
        int pivot = arr[0]; // Choosing the first element as the pivot
        int l = 0, r = arr.length - 1;
    
        while (l <= r) {
            while (arr[l] < pivot) {
                l++;
            }
            while (arr[r] > pivot) {
                r--;
            }
            if (l <= r) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }
    }
    
    public static void main(String[] args) {
            int[] arr={23, -9, -5,24,3, -3,32};
            
            display(arr);
            partition(arr);
            display(arr);
        
    }
}
