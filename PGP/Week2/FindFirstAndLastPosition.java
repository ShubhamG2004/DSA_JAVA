package PGP.Week2;

class FindFirstAndLastPosition {

    // LeetCode 34: Find First and Last Position of Element in Sorted Array
    public static int[] searchRange(int[] nums, int target) {
        int first = findBound(nums, target, true);
        if (first == -1) {
            return new int[] { -1, -1 };
        }
        int last = findBound(nums, target, false);
        return new int[] { first, last };
    }

    // Binary search for first or last occurrence based on the flag.
    private static int findBound(int[] nums, int target, boolean findFirst) {
        int left = 0;
        int right = nums.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                ans = mid;
                if (findFirst) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }

}
