package PGP.Week2;

import java.util.Arrays;

public class Question19 {

    public void nextPermutation(int[] nums) {
        int pivot = -1;
        int n = nums.length;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        if (pivot != -1) {
            for (int i = n - 1; i > pivot; i--) {
                if (nums[i] > nums[pivot]) {
                    int temp = nums[i];
                    nums[i] = nums[pivot];
                    nums[pivot] = temp;
                    break;
                }
            }
        }

        reverse(nums, pivot + 1, n - 1);
    }

    private void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    private static void runTest(int[] input, int[] expected) {
        Question19 solution = new Question19();
        int[] arr = input.clone();
        solution.nextPermutation(arr);
        System.out.println("Input:     " + Arrays.toString(input));
        System.out.println("Output:    " + Arrays.toString(arr));
        System.out.println("Expected:  " + Arrays.toString(expected));
        System.out.println("Result:    " + (Arrays.equals(arr, expected) ? "PASS" : "FAIL"));
        System.out.println();
    }

    public static void main(String[] args) {
        runTest(new int[] {1, 2, 3}, new int[] {1, 3, 2});
        runTest(new int[] {3, 2, 1}, new int[] {1, 2, 3});
        runTest(new int[] {1, 1, 5}, new int[] {1, 5, 1});
        runTest(new int[] {1, 3, 2}, new int[] {2, 1, 3});
    }
}
