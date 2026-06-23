import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;

public class Question12_1 {

    public List<List<Integer>> subsets(int[] nums) {
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
        subsequence(index + 1, nums, curr, res);
    }

    public static void main(String[] args) {
        Question12_1 obj = new Question12_1();

        // Test Case 1
        int[] nums1 = {1, 2, 3};
        System.out.println("Input: [1,2,3]");
        System.out.println("Subsets:");
        System.out.println(obj.subsets(nums1));

        // Test Case 2
        int[] nums2 = {0};
        System.out.println("\nInput: [0]");
        System.out.println("Subsets:");
        System.out.println(obj.subsets(nums2));

        // Test Case 3
        int[] nums3 = {1, 2};
        System.out.println("\nInput: [1,2]");
        System.out.println("Subsets:");
        System.out.println(obj.subsets(nums3));

        // Test Case 4
        int[] nums4 = {};
        System.out.println("\nInput: []");
        System.out.println("Subsets:");
        System.out.println(obj.subsets(nums4));
    }
}