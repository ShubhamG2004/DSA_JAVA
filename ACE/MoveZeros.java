import java.util.Arrays;
import java.util.Scanner;

public class MoveZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,0,2,0,3,4,0};
        int index = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                arr[index++] = arr[i];
            }
        }

        while(index < arr.length){
            arr[index++] = 0;
        }

        System.out.println(Arrays.toString(arr));
    }
}
