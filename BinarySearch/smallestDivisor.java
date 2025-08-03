package BinarySearch;

public class smallestDivisor {
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 9};
        int threshold = 6;

        Solution solution = new Solution();
        int result = solution.smallestDivisor(nums, threshold);

        System.out.println("Smallest Divisor: " + result);
    }
}

class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1;
        int right = getMax(nums);
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (isValid(nums, mid, threshold)) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return ans;
    }

    private int getMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        return max;
    }

    private boolean isValid(int[] nums, int divisor, int threshold) {
        int total = 0;
        for (int num : nums) {
            total += (num + divisor - 1) / divisor; // ceiling division
        }
        return total <= threshold;
    }
}
