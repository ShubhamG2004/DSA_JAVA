import java.util.ArrayList;
import java.util.List;

public class BacktrackingExample {

    public static List<List<Integer>> generateSubsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        // Start the backtracking process from index 0 with an empty subset
        backtrack(result, new ArrayList<>(), nums, 0);
        return result;
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> currentSubset, int[] nums, int start) {
        // 1. Base case / Add current valid state to results
        // We must create a new ArrayList, otherwise we just add a reference that will be modified later
        result.add(new ArrayList<>(currentSubset));

        // 2. Iterate through all possible choices from the current state
        for (int i = start; i < nums.length; i++) {
            // Choose: Add the current number to our subset
            currentSubset.add(nums[i]);

            // Explore: Move to the next level (i + 1)
            backtrack(result, currentSubset, nums, i + 1);

            // Un-choose (Backtrack): Remove the last element to try the next number in the loop
            currentSubset.remove(currentSubset.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> subsets = generateSubsets(nums);
        
        System.out.println(subsets);
        // Output: [[], [1], [1, 2], [1, 2, 3], [1, 3], [2], [2, 3], [3]]
    }
}