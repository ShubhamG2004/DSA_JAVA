public class Number_of_unique_alphabetic {
    public int countMappings(String s) {
        int n = s.length();
        if (n == 0) return 0;

        // dp[i] = number of ways to decode substring[0..i-1]
        int[] dp = new int[n + 1];
        dp[0] = 1; // base case
        dp[1] = (s.charAt(0) != '0') ? 1 : 0;

        for (int i = 2; i <= n; i++) {
            int oneDigit = Integer.parseInt(s.substring(i - 1, i));
            int twoDigits = Integer.parseInt(s.substring(i - 2, i));

            // Single digit valid (1-9)
            if (oneDigit >= 1 && oneDigit <= 9) {
                dp[i] += dp[i - 1];
            }

            // Two digits valid (10-26)
            if (twoDigits >= 10 && twoDigits <= 26) {
                dp[i] += dp[i - 2];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Number_of_unique_alphabetic obj = new Number_of_unique_alphabetic();
        System.out.println(obj.countMappings("226"));   // 5
        System.out.println(obj.countMappings("11292")); // 7
    }
}
