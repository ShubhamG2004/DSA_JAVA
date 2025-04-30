import java.util.HashMap;
import java.util.HashSet;

public class MissingPositive {
    public static int MissingPositiveNum(int[] arr, int n){
        HashSet<Integer> h = new HashSet();

        for(int i=0;i<n;i++){
            h.add(arr[i]);
        }

        for(int i=2;i<=n+1;i=i+2){
            if(!h.contains(i)){
                return i;
            }
        }

        return -1;
        
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int n = arr.length;
        int miss = MissingPositiveNum(arr,n);
        System.out.println("\n"+ miss);
    }
}
