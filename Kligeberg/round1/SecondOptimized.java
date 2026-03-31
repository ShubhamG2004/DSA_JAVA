package round1;

package round1;

public class SecondOptimized {

    // Optimized function
    public static String minDiffString(String s, int k) {
        // Edge case: if k is greater than string length
        if (k > s.length()) {
            k = s.length();
        }
        
        // Directly return first k characters
        return s.substring(0, k);
    }

    public static void main(String[] args) {

        // Example 1
        String s1 = "xaxcd";
        int k1 = 4;
        System.out.println(minDiffString(s1, k1));  // Output: xaxc

        // Example 2
        String s2 = "search";
        int k2 = 4;
        System.out.println(minDiffString(s2, k2));  // Output: sear

        // Example 3
        String s3 = "xyz";
        int k3 = 2;
        System.out.println(minDiffString(s3, k3));  // Output: xy
    }
}
