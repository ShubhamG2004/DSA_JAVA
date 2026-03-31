package round1;

public class FirstOptimized {

    public static int longestIncDec(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;

        int inc = 1, dec = 1;
        int maxLen = 1;

        for (int i = 1; i < n; i++) {

            // increasing
            if (nums[i] > nums[i - 1]) {
                inc++;
            } else {
                inc = 1;
            }

            // decreasing
            if (nums[i] < nums[i - 1]) {
                dec++;
            } else {
                dec = 1;
            }

            maxLen = Math.max(maxLen, Math.max(inc, dec));
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1};
        System.out.println(longestIncDec(nums)); // Output: 3
    }
}