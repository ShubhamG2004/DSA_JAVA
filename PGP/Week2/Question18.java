package PGP.Week2;

import java.util.Arrays;

public class Question18 {

    static void segregateEvenOdd(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i <= j) {
            if (arr[i] % 2 == 1 && arr[j] % 2 == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            if (arr[i] % 2 == 0) {
                i++;
            } else if (arr[j] % 2 == 1) {
                j--;
            }
        }
    }

    private static void runTest(int[] input) {
        int[] arr = input.clone();
        segregateEvenOdd(arr);
        System.out.println("Input:  " + Arrays.toString(input));
        System.out.println("Output: " + Arrays.toString(arr));
        System.out.println();
    }

    public static void main(String[] args) {
        runTest(new int[] {12, 34, 45, 9, 8, 90, 3});
        runTest(new int[] {1, 3, 5, 7, 9});
        runTest(new int[] {2, 4, 6, 8, 10});
        runTest(new int[] {1, 2, 3, 4, 5, 6});
    }
}
