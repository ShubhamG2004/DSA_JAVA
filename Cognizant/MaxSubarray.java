import java.util.ArrayList;

public class MaxSubarray {
    public static ArrayList<Integer> maxSubarrayList(int[] nums) {
        int maxSoFar = nums[0];
        int currentSum = nums[0];
        int start = 0, end = 0, tempStart = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > currentSum + nums[i]) {
                currentSum = nums[i];
                tempStart = i;
            } else {
                currentSum += nums[i];
            }

            if (currentSum > maxSoFar) {
                maxSoFar = currentSum;
                start = tempStart;
                end = i;
            }
        }

        // Store subarray in ArrayList
        ArrayList<Integer> subarray = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            subarray.add(nums[i]);
        }

        return subarray;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        ArrayList<Integer> result = maxSubarrayList(nums);
        System.out.println("Max Subarray: " + result);
    }
}
