package PGP.Week2;

import java.util.Arrays;

public class FindPeakElement {
    static class Solution {
        public int findPeakElement(int[] nums) {
            int left = 0;
            int right = nums.length - 1;

            while (left < right) {
                int mid = left + (right - left) / 2;

                if (nums[mid] > nums[mid + 1]) {
                    right = mid;
                } else {
                    left = mid + 1; 
                }
            }

            return left; // or right (both same)
        }
        public int findPeakElement2(int[] nums) {
            int n = nums.length;
            int left =0;
            int right = n-1;

            while(left <= right){
                int mid = left + (right - left) / 2;

                boolean isLeftOk = (mid == 0) || (nums[mid-1] < nums[mid]);
                boolean isRightOk = (mid == n-1) || (nums[mid] > nums[mid+1]);

                if(isLeftOk && isRightOk){
                    return mid;
                }

                if(mid >0 && nums[mid] > nums[mid+1]){
                    right = mid-1;
                }
                else{
                    left = mid + 1;
                }
            }

            return left;
        }
    }

    private static void runTest(Solution solver, int[] nums, int expected) {
        int result = solver.findPeakElement(nums);
        int peakValue = nums[result];
        boolean passed = result == expected;

        System.out.println("nums=" + Arrays.toString(nums)
                + " -> index=" + result
                + ", value=" + peakValue
                + ", expectedIndex=" + expected
                + (passed ? " [PASS]" : " [FAIL]"));
    }

    public static void main(String[] args) {
        Solution solver = new Solution();

        // LeetCode-style sample tests
        runTest(solver, new int[] { 1, 2, 3, 1 }, 2);
        runTest(solver, new int[] { 1, 2, 1, 3, 5, 6, 4 }, 5);

        // Additional edge cases
        runTest(solver, new int[] { 1 }, 0);
        runTest(solver, new int[] { 2, 1 }, 0);
        runTest(solver, new int[] { 1, 2 }, 1);
        runTest(solver, new int[] { 1, 3, 2 }, 1);
    }
}
