package PGP.Week3;

import java.util.ArrayList;
import java.util.List;

public class Question17 {
    public List<Integer> majorityElement(int[] nums) {

        int count1 = 0, count2 = 0;
        int candidate1 = 0, candidate2 = 0;

        // Step 1: Find potential candidates
        for (int num : nums) {

            if (candidate1 == num) {
                count1++;
            }
            else if (candidate2 == num) {
                count2++;
            }
            else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            }
            else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            }
            else {
                count1--;
                count2--;
            }
        }

        // Step 2: Verify candidates
        count1 = 0;
        count2 = 0;

        for (int num : nums) {
            if (num == candidate1) count1++;
            else if (num == candidate2) count2++;
        }

        List<Integer> ans = new ArrayList<>();

        int n = nums.length;

        if (count1 > n / 3) ans.add(candidate1);
        if (count2 > n / 3) ans.add(candidate2);

        return ans;
    }

    public static void main(String[] args) {
        Question17 solution = new Question17();

        // Test Case 1: Two majority elements
        int[] test1 = {3, 2, 3};
        List<Integer> result1 = solution.majorityElement(test1);
        System.out.println("Test 1 - {3, 2, 3}: " + result1);
        System.out.println("Expected: [3]");

        // Test Case 2: Two majority elements
        int[] test2 = {1, 1, 1, 3, 3, 2, 2, 2};
        List<Integer> result2 = solution.majorityElement(test2);
        System.out.println("\nTest 2 - {1, 1, 1, 3, 3, 2, 2, 2}: " + result2);
        System.out.println("Expected: [1, 2] or [2, 1]");

        // Test Case 3: Single element
        int[] test3 = {1};
        List<Integer> result3 = solution.majorityElement(test3);
        System.out.println("\nTest 3 - {1}: " + result3);
        System.out.println("Expected: [1]");

        // Test Case 4: All same elements
        int[] test4 = {5, 5, 5, 5, 5};
        List<Integer> result4 = solution.majorityElement(test4);
        System.out.println("\nTest 4 - {5, 5, 5, 5, 5}: " + result4);
        System.out.println("Expected: [5]");

        // Test Case 5: No majority elements
        int[] test5 = {1, 2, 3, 4, 5, 6};
        List<Integer> result5 = solution.majorityElement(test5);
        System.out.println("\nTest 5 - {1, 2, 3, 4, 5, 6}: " + result5);
        System.out.println("Expected: []");

        // Test Case 6: Large array with two majority elements
        int[] test6 = {1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4, 5};
        List<Integer> result6 = solution.majorityElement(test6);
        System.out.println("\nTest 6 - {1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4, 5}: " + result6);
        System.out.println("Expected: [1, 2]");

        // Test Case 7: Negative numbers
        int[] test7 = {-1, -1, -1, -2, -2, -2, 0, 1, 2};
        List<Integer> result7 = solution.majorityElement(test7);
        System.out.println("\nTest 7 - {-1, -1, -1, -2, -2, -2, 0, 1, 2}: " + result7);
        System.out.println("Expected: [-1, -2]");

        // Test Case 8: Two elements
        int[] test8 = {0, 0};
        List<Integer> result8 = solution.majorityElement(test8);
        System.out.println("\nTest 8 - {0, 0}: " + result8);
        System.out.println("Expected: [0]");
    }
}
