package PGP.Week2;

import java.util.Arrays;

public class Question8 {
    static class Solution {
        public int singleNonDuplicate(int[] nums) {
            int left = 0;
            int right = nums.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                boolean leftCheck = (mid == 0) || nums[mid] != nums[mid - 1];
                boolean rightCheck = (mid == nums.length - 1) || nums[mid] != nums[mid + 1];

                if (leftCheck && rightCheck) {
                    return nums[mid];
                }

                if (mid % 2 == 0) {
                    if (mid + 1 < nums.length && nums[mid] == nums[mid + 1]) {
                        left = mid + 2;
                    } else {
                        right = mid - 1;
                    }
                } else {
                    if (nums[mid] == nums[mid - 1]) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
            }

            return -1;
        }
    }

    private static void runTest(Solution solver, int[] nums, int expected) {
        int result = solver.singleNonDuplicate(nums);
        boolean passed = result == expected;

        System.out.println("nums=" + Arrays.toString(nums)
                + " -> result=" + result
                + ", expected=" + expected
                + (passed ? " [PASS]" : " [FAIL]"));
    }

    public static void main(String[] args) {
        Solution solver = new Solution();

        // Question 8 sample-style tests
        runTest(solver, new int[] { 1, 1, 2, 3, 3, 4, 4, 8, 8 }, 2);
        runTest(solver, new int[] { 3, 3, 7, 7, 10, 11, 11 }, 10);

        // Additional edge cases
        runTest(solver, new int[] { 1 }, 1);
        runTest(solver, new int[] { 1, 1, 2 }, 2);
        runTest(solver, new int[] { 2, 3, 3 }, 2);
        runTest(solver, new int[] { 1, 1, 2, 2, 3 }, 3);
        runTest(solver, new int[] { 0, 0, 1, 1, 2, 3, 3 }, 2);
        runTest(solver, new int[] { 5, 6, 6, 7, 7, 8, 8 }, 5);
    }
}
