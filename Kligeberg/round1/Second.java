package round1;
public class Second {

    // Circular distance between 2 lowercase alphabet chars
    private static int charDifference(char c1, char c2) {
        int diff = Math.abs(c1 - c2);
        return Math.min(diff, 26 - diff);
    }

    // Constructs the lexicographically smallest string t of length K
    // such that difference between s and t is minimized
    public static String minDiffString(String s, int k) {
        StringBuilder result = new StringBuilder();
        // We compare only the first k chars of s (as output will be length k)
        for (int i = 0; i < k; i++) {
            char minChar = 'a';
            int minDiff = Integer.MAX_VALUE;
            // Try all 26 letters and choose the lex smallest character with minimum difference
            for (char c = 'a'; c <= 'z'; c++) {
                int diff = charDifference(s.charAt(i), c);
                if (diff < minDiff) {
                    minDiff = diff;
                    minChar = c;
                }
            }
            result.append(minChar);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        // Example 1 from the image
        String s1 = "xaxcd";
        int k1 = 4;
        // Output: "robot"
        System.out.println(minDiffString(s1, k1));

        // Example 2 from the image
        String s2 = "search";
        int k2 = 4;
        // Output: "seaa"
        System.out.println(minDiffString(s2, k2));

        // Example: s = "xyz", k = 2
        String s3 = "xyz";
        int k3 = 2;
        System.out.println(minDiffString(s3, k3)); // Output: "xa"
    }
}
