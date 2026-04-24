package PGP.Week2;

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
}
