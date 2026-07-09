import java.util.*;

class Question15 {

    public boolean wordBreak(String s, List<String> wordDict) {
        return solve(s, wordDict, 0);
    }

    private boolean solve(String s, List<String> wordDict, int index) {

        // Base case: reached end of string
        if (index == s.length()) {
            return true;
        }

        // Try every possible substring
        for (int end = index + 1; end <= s.length(); end++) {

            String word = s.substring(index, end);

            if (wordDict.contains(word)) {

                if (solve(s, wordDict, end)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Question15 obj = new Question15();

        // Test Case 1
        String s1 = "leetcode";
        List<String> wordDict1 = Arrays.asList("leet", "code");

        System.out.println(obj.wordBreak(s1, wordDict1));
        // Output: true


        // Test Case 2
        String s2 = "applepenapple";
        List<String> wordDict2 = Arrays.asList("apple", "pen");

        System.out.println(obj.wordBreak(s2, wordDict2));
        // Output: true


        // Test Case 3
        String s3 = "catsandog";
        List<String> wordDict3 = Arrays.asList(
            "cats", "dog", "sand", "and", "cat"
        );

        System.out.println(obj.wordBreak(s3, wordDict3));
        // Output: false
    }
}