class Question13 {

    public boolean predictTheWinner(int[] nums) {
        return solve(nums, 0, nums.length - 1) >= 0;
    }

    private int solve(int[] nums, int left, int right) {
        if (left == right) {
            return nums[left];
        }

        int pickLeft = nums[left] - solve(nums, left + 1, right);

        int pickRight = nums[right] - solve(nums, left, right - 1);

        return Math.max(pickLeft, pickRight);
    }
    public static void main(String[] args) {

        Question13 solution = new Question13();

        // Test Case 1
        int[] nums1 = {1, 5, 2};
        System.out.println(solution.predictTheWinner(nums1));
        // Output: false

        // Test Case 2
        int[] nums2 = {1, 5, 233, 7};
        System.out.println(solution.predictTheWinner(nums2));
        // Output: true

        // Test Case 3
        int[] nums3 = {1, 1};
        System.out.println(solution.predictTheWinner(nums3));
        // Output: true
    }
}