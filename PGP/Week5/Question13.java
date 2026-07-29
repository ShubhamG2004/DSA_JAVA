class Question13 {
    public int findDuplicate(int[] nums) {

        int slow = 0;
        int fast = 0;

        // Phase 1: Find meeting point
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Phase 2: Find cycle entry
        slow = 0;

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}