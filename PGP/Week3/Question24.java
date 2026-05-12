package PGP.Week3;

public class Question24 {
     static int countValid(int open, int close) {
        
        // Invalid case
        if (close < open)
            return 0;

        if (open == 0)
            return 1;

        return countValid(open - 1, close) + countValid(open, close - 1);
    }

    // Function to count valid parentheses
    // arrangements of length n
    static int findWays(int n) {
       
        // If n is odd, no valid arrangements possible
        if (n % 2 == 1)
            return 0;
        return countValid(n / 2, n / 2);
    }




        static int findWays2(int n) {
        if (n % 2 == 1)
            return 0;
        
        int pairs = n / 2;
        int[][] dp = new int[pairs + 1][pairs + 1];
        
        // Base case: when no opening brackets left
        for (int close = 0; close <= pairs; close++) {
            dp[0][close] = 1;
        }
        
        // Fill the DP table
        for (int open = 1; open <= pairs; open++) {
            
            // valid only if closes left ≥ opens left
            for (int close = open; close <= pairs; close++) {  
                dp[open][close] = dp[open-1][close] + dp[open][close-1];
            }
        }
        
        return dp[pairs][pairs];
    }



    static int binomialCoeff(int n, int k) {
        int res = 1;

        // Since C(n, k) = C(n, n-k)
        if (k > n - k)
            k = n - k;

        for (int i = 0; i < k; ++i) {
            res *= (n - i);
            res /= (i + 1);
        }

        return res;
    }

    // A Binomial coefficient based function to
    // find nth catalan number in O(n) time
    static int catalan(int n) {

        // Calculate value of 2nCn
        int c = binomialCoeff(2 * n, n);

        // return 2nCn/(n+1)
        return c / (n + 1);
    }

    // Function to find possible ways
    static int findWays3(int n) {
        if (n % 2 != 0)
            return 0;
        return catalan(n / 2);
    }

    public static void main(String[] args) {
        System.out.println("=== Valid Parentheses Arrangements ===\n");

        // Test cases
        int[] testCases = {2, 4, 6, 8, 10};

        for (int n : testCases) {
            System.out.println("For n = " + n + ":");

            // Method 1: Recursive (Exponential - O(2^n))
            System.out.println("  Method 1 (Recursive - O(2^n)):");
            long start1 = System.nanoTime();
            if (n <= 12) { // Only for smaller values to avoid timeout
                int result1 = findWays(n);
                long end1 = System.nanoTime();
                long time1 = (end1 - start1) / 1000; // Convert to microseconds
                System.out.println("    Result: " + result1 + " | Time: " + time1 + " µs");
            } else {
                System.out.println("    Skipped (too slow for large n)");
            }

            // Method 2: Dynamic Programming (O(n^2))
            System.out.println("  Method 2 (DP - O(n^2)):");
            long start2 = System.nanoTime();
            int result2 = findWays2(n);
            long end2 = System.nanoTime();
            long time2 = (end2 - start2) / 1000; // Convert to microseconds
            System.out.println("    Result: " + result2 + " | Time: " + time2 + " µs");

            // Method 3: Catalan Formula (O(n))
            System.out.println("  Method 3 (Catalan - O(n)):");
            long start3 = System.nanoTime();
            int result3 = findWays3(n);
            long end3 = System.nanoTime();
            long time3 = (end3 - start3) / 1000; // Convert to microseconds
            System.out.println("    Result: " + result3 + " | Time: " + time3 + " µs");

            System.out.println();
        }

        // Large test case - comparing optimized methods
        System.out.println("\n=== Large Test Case (n = 20) ===");
        int n = 20;
        System.out.println("Method 2 (DP - O(n^2)):");
        long start = System.nanoTime();
        int res2 = findWays2(n);
        long end = System.nanoTime();
        System.out.println("  Result: " + res2 + " | Time: " + (end - start) / 1000 + " µs");

        System.out.println("Method 3 (Catalan - O(n)):");
        start = System.nanoTime();
        int res3 = findWays3(n);
        end = System.nanoTime();
        System.out.println("  Result: " + res3 + " | Time: " + (end - start) / 1000 + " µs");
    }
}
