import java.lang.reflect.Array;
import java.util.ArrayList;

public class SubSeqEqualSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 6;
        ArrayList<Integer> result = new ArrayList<>();
        findSubsequences(arr, target, 0,0, result);
    }
    public static void findSubsequences(int[] arr, int target, int idx, int sum, ArrayList<Integer> res){

        if(idx == arr.length){
            if(sum == target){
                System.out.println(res);
            }
            return;
        }
        // Pick Index
        res.add(arr[idx]);
        sum+=arr[idx];
        findSubsequences(arr, target, idx+1, sum, res);

        // Not Pick Index
        res.remove(res.size()-1);
        sum-= arr[idx];
        findSubsequences(arr, target, idx+1, sum, res);

    }

}
