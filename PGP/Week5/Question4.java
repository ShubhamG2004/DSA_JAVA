import java.util.HashMap;
import java.util.Scanner;

public class Question4 {

    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while (map.get(ch) > 1) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        Question4 obj = new Question4();
        int ans = obj.lengthOfLongestSubstring(s);

        System.out.println("Length of Longest Substring Without Repeating Characters: " + ans);

        sc.close();
    }
}