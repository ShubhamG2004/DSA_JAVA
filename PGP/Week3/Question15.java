package PGP.Week3;

public class Question15 {
    static void Rearrange(int[] arr) {
        int n = arr.length;
        
        // Create an auxiliary array to store new values
        int[] newArr = new int[n];
        
        // Place each element at its correct index
        for (int i = 0; i < n; i++) {
            newArr[arr[i]] = i;
        }
        
        // Copy modified values back to the original array
        for (int i = 0; i < n; i++) {
            arr[i] = newArr[i];
        }
    }
    public static void rearrange1(int[] arr) {

        int n = arr.length;

        // Store new values using modulo
        for (int i = 0; i < n; i++) {
            arr[arr[i] % n] += i * n;
        }

        // Extract new values
        for (int i = 0; i < n; i++) {
            arr[i] /= n;
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Rearrange Array Test Cases ===\n");

        // Test Case 1
        int[] test1 = {1, 0, 2, 0};
        System.out.println("Test1 - Input: " + java.util.Arrays.toString(test1));
        rearrange1(test1);
        System.out.println("Output: " + java.util.Arrays.toString(test1));
        System.out.println("Expected: [0, 1, 2, 3]\n");

        // Test Case 2
        int[] test2 = {3, 2, 0, 1};
        System.out.println("Test2 - Input: " + java.util.Arrays.toString(test2));
        rearrange1(test2);
        System.out.println("Output: " + java.util.Arrays.toString(test2));
        System.out.println("Expected: [2, 3, 1, 0]\n");

        // Test Case 3
        int[] test3 = {0, 1, 2};
        System.out.println("Test3 - Input: " + java.util.Arrays.toString(test3));
        rearrange1(test3);
        System.out.println("Output: " + java.util.Arrays.toString(test3));
        System.out.println("Expected: [0, 1, 2]\n");

        // Test Case 4
        int[] test4 = {2, 0, 1};
        System.out.println("Test4 - Input: " + java.util.Arrays.toString(test4));
        rearrange1(test4);
        System.out.println("Output: " + java.util.Arrays.toString(test4));
        System.out.println("Expected: [1, 2, 0]\n");

        // Test Case 5
        int[] test5 = {1, 2, 0, 3};
        System.out.println("Test5 - Input: " + java.util.Arrays.toString(test5));
        rearrange1(test5);
        System.out.println("Output: " + java.util.Arrays.toString(test5));
        System.out.println("Expected: [2, 0, 1, 3]");
    }
}
