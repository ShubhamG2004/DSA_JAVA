import java.util.Arrays;
import java.util.HashMap;

public class checkTwoAnagram{
    public static void main(String[] args) {
        String str1 = "ate";
        String str2 = "eat";

        boolean check = checkAnagram(str1 ,str2);
        System.out.println();
        System.out.println(check);
    }
    public static boolean checkAnagram(String str1, String str2){
        HashMap<Character, Integer> seenMap = new HashMap<>();
        if(str1.length() != str2.length()){
            return false;
        }
        for(char ch : str1.toCharArray()){
            seenMap.put(ch, seenMap.getOrDefault(ch, 0) + 1);
        }
        for(char ch : str2.toCharArray()){
            if(!seenMap.containsKey(ch) || seenMap.get(ch) == 0){
                return false;
            }
            seenMap.put(ch, seenMap.get(ch) - 1);
        }
        return true;
    }
    public static boolean checkAnagram2(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}