import java.util.Arrays;

class Question1 {

    boolean twoSum(int arr[], int target) {
        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                return true;
            } 
            else if (target < sum) {
                right--;
            } 
            else {
                left++;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        // Test Case 1
        int[] arr1 = {1, 4, 45, 6, 10, 8};
        int target1 = 16;
        System.out.println("Test Case 1: " + obj.twoSum(arr1, target1));

        // Test Case 2
        int[] arr2 = {1, 2, 4, 3, 6};
        int target2 = 10;
        System.out.println("Test Case 2: " + obj.twoSum(arr2, target2));

        // Test Case 3
        int[] arr3 = {5, 5};
        int target3 = 10;
        System.out.println("Test Case 3: " + obj.twoSum(arr3, target3));

        // Test Case 4
        int[] arr4 = {-3, 4, 3, 90};
        int target4 = 0;
        System.out.println("Test Case 4: " + obj.twoSum(arr4, target4));
    }
}