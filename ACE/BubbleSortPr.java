import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class BubbleSortPr {

    static void bubbleSort(int[] arr){
        int len = arr.length;
        boolean isSorted;
        for(int i=0;i<len-1;i++){
            isSorted = false;

            for(int j=0;j<len-1-i;j++){
                if(arr[j] > arr[j+1]){
                    isSorted = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

            if(!isSorted){
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {12,23,13,65,87,54,69,90};

        System.out.println("Before Sort:");
        for(int num:arr){
            System.out.print(num+ " ");    
        }

        bubbleSort(arr);
        System.out.println();

        System.out.println("After Sort:");
        for(int num:arr){
            System.out.print(num+ " ");    
        }

    }
}
