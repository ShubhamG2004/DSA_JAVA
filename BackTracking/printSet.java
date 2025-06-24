import java.lang.reflect.Array;
import java.util.ArrayList;

public class printSet {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        ArrayList<Integer> ans = new ArrayList<>();
        printSubstring(arr, 0, ans);
    }
    public static void printSubstring(int arr[], int idx, ArrayList<Integer> ans) {
        if(idx == arr.length) {
            System.out.println(ans);
            return;
        }
        ans.add(arr[idx]);
        printSubstring(arr, idx+1, ans);
        ans.remove(ans.size() - 1);
        printSubstring(arr, idx+1, ans);
    }
}
