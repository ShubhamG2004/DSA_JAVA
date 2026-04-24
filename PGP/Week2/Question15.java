package PGP.Week2;

import java.util.Arrays;

public class Question15 {

    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;

        int low = 0;
        int high = nums[n - 1] - nums[0];

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int count = lessCountPairs(nums, mid);

            if (count < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }

    int lessCountPairs(int[] nums, int maxDist) {
        int count = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            // Shrinks the window when distance exceeds maxDist.
            while (nums[right] - nums[left] > maxDist) {
                left++;
            }

            count += (right - left);
        }

        return count;
    }
}
