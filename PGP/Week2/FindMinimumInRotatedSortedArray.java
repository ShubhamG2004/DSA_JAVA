package PGP.Week2;

import java.util.Arrays;

class Solution {
    public int findMin(int[] nums) {
        int minNum = Integer.MAX_VALUE;
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (nums[l] <= nums[mid]) {
                minNum = Math.min(minNum, nums[l]);
                l = mid + 1;
            } else {
                minNum = Math.min(minNum, nums[mid]);
                r = mid - 1;
            }
        }
        return minNum;
    }
}

public class FindMinimumInRotatedSortedArray {
    private static void runTest(Solution solver, int[] nums, int expected) {
        int result = solver.findMin(nums);
        System.out.println("nums=" + Arrays.toString(nums)
                + " -> result=" + result
                + ", expected=" + expected
                + (result == expected ? " [PASS]" : " [FAIL]"));
    }

    public static void main(String[] args) {
        Solution solver = new Solution();

        runTest(solver, new int[] { 3, 4, 5, 1, 2 }, 1);
        runTest(solver, new int[] { 4, 5, 6, 7, 0, 1, 2 }, 0);
        runTest(solver, new int[] { 11, 13, 15, 17 }, 11);
        runTest(solver, new int[] { 2, 1 }, 1);
        runTest(solver, new int[] { 1 }, 1);
    }
}
