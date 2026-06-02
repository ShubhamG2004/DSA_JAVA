package PGP.Week3;

import java.util.Arrays;

public class Question20 {
    public int maxProduct(int[] nums) {
        int prefix = 1;
        int suffix = 1;

        int maxProd = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(prefix == 0) prefix =1;
            if(suffix == 0) suffix =1;
            prefix = prefix * nums[i];
            suffix = suffix * nums[n-i-1];

            maxProd = Math.max(maxProd,Math.max(suffix, prefix));
        }

        return maxProd;
    }

    public static void main(String[] args) {
        Question20 q = new Question20();

        int[][] tests = {
                {2, 3, -2, 4},
                {-2, 0, -1},
                {-2},
                {0, 2},
                {-2, 3, -4},
                {-1, -2, -3, 0},
                {-2, -3, -4},
                {0, 0, 0},
                {-2, 0, -1, -3, 4}
        };

        int[] expected = {6, 0, -2, 2, 24, 6, 12, 0, 12};

        for (int i = 0; i < tests.length; i++) {
            runTest(q, tests[i], expected[i]);
        }
    }

    private static void runTest(Question20 solver, int[] nums, int expected) {
        int actual = solver.maxProduct(nums);
        String status = (actual == expected) ? "PASS" : "FAIL";
        System.out.printf("Input: %s | Expected: %d | Actual: %d | %s%n", Arrays.toString(nums), expected, actual, status);
    }
}
