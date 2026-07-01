import java.util.*;

public class QuestionBTPr {

    static String[] map = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
    };

    public static ArrayList<String> possibleWords(int[] arr) {
        ArrayList<String> ans = new ArrayList<>();
        backtrack(arr, 0, new StringBuilder(), ans);
        return ans;
    }

    private static void backtrack(int[] arr, int index,
                                  StringBuilder curr,
                                  ArrayList<String> ans) {

        if (index == arr.length) {
            if (curr.length() > 0)
                ans.add(curr.toString());
            return;
        }

        // Skip 0 and 1
        if (arr[index] == 0 || arr[index] == 1) {
            backtrack(arr, index + 1, curr, ans);
            return;
        }

        String letters = map[arr[index]];

        for (char ch : letters.toCharArray()) {
            curr.append(ch);
            backtrack(arr, index + 1, curr, ans);
            curr.deleteCharAt(curr.length() - 1); // Backtrack
        }
    }

    public static void main(String[] args) {

        int[] arr = {2, 3};

        ArrayList<String> result = possibleWords(arr);

        System.out.println(result);

        // Another Test Case
        int[] arr2 = {8, 8, 1};

        System.out.println(possibleWords(arr2));
    }
}