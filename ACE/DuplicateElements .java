import java.util.Scanner;
import java.util.HashSet;

class DuplicateElements  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for(int i=0;i<length;i++){
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();

        for(int val: arr){
            if(set.contains(val)){
                System.out.print(val + " ");
            }else{
                set.add(val);
            }
        }

    }
}
