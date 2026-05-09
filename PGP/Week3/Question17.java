package PGP.Week3;

public class Question17 {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        // Step 1: Find intersection point
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Step 2: Find entrance of cycle
        slow = nums[0];

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }

    public static void main(String[] args) {
        Question17 q17 = new Question17();
        int[] nums = {1, 3, 4, 2, 2};
        System.out.println("Duplicate number: " + q17.findDuplicate(nums));
    }
}
