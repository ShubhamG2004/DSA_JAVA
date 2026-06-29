import java.util.*;

class Question16 {

    public List<List<Integer>> subsetsUnique(int[] nums) {
        Arrays.sort(nums); // Sort to handle duplicates
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        subsequence(0, nums, curr, res);

        return res;
    }

    public void subsequence(int index, int[] nums,
                            List<Integer> curr,
                            List<List<Integer>> res) {

        if (index == nums.length) {
            res.add(new ArrayList<>(curr));
            return;
        }

        // Include current element
        curr.add(nums[index]);
        subsequence(index + 1, nums, curr, res);

        // Exclude current element
        curr.remove(curr.size() - 1);

        // Skip duplicates
        while ((index + 1 < nums.length) && nums[index] == nums[index + 1]) {
            index++;
        }

        subsequence(index + 1, nums, curr, res);
    }

    public static void main(String[] args) {
        Question16 obj = new Question16();

        // Test Case 1
        int[] nums1 = {1, 2, 2};
        System.out.println("Input: " + Arrays.toString(nums1));
        System.out.println("Unique Subsets:");
        System.out.println(obj.subsetsUnique(nums1));

        // Test Case 2
        int[] nums2 = {1, 2, 2, 3};
        System.out.println("\nInput: " + Arrays.toString(nums2));
        System.out.println("Unique Subsets:");
        System.out.println(obj.subsetsUnique(nums2));

        // Test Case 3
        int[] nums3 = {2, 2, 2};
        System.out.println("\nInput: " + Arrays.toString(nums3));
        System.out.println("Unique Subsets:");
        System.out.println(obj.subsetsUnique(nums3));

        // Test Case 4
        int[] nums4 = {1};
        System.out.println("\nInput: " + Arrays.toString(nums4));
        System.out.println("Unique Subsets:");
        System.out.println(obj.subsetsUnique(nums4));
    }
}