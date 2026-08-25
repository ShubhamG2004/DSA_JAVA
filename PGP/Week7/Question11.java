class Solution {
    public int missingMultiple(int[] nums, int k) {

        boolean[] present = new boolean[101];

        // Mark elements present in nums
        for (int num : nums) {
            present[num] = true;
        }

        // Check multiples of k
        for (int multiple = k; ; multiple += k) {

            if (multiple > 100 || !present[multiple]) {
                return multiple;
            }
        }
    }
}