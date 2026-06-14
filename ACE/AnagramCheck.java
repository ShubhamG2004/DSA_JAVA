import java.lang.reflect.Array;
import java.util.*;

public class AnagramCheck {
    public static boolean isAnagram(String s1, String s2){
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(!Arrays.equals(arr1,arr2)){
            return false;
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        Boolean res = isAnagram(s1,s2);

        System.out.println(res);

    }
}
