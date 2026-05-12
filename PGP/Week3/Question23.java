package PGP.Week3;

import java.util.Arrays;

class Question23{
    public void rearrange(int arr[]) {

        int n = arr.length;
        Arrays.sort(arr);

        int maxIdx = n - 1;
        int minIdx = 0;

        int maxElem = arr[n - 1] + 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {

                arr[i] = arr[i] + (arr[maxIdx] % maxElem) * maxElem;
                maxIdx--;

            }
            else {

                arr[i] = arr[i] + (arr[minIdx] % maxElem) * maxElem;
                minIdx++;
            }
        }

        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / maxElem;
        }
    }

    public static void main(String[] args) {
        Question23 q23 = new Question23();

        // Test Case 1: Simple array
        System.out.println("Test Case 1:");
        int arr1[] = {5, 8, 1, 4, 2};
        System.out.println("Original: " + Arrays.toString(arr1));
        q23.rearrange(arr1);
        System.out.println("After rearrange: " + Arrays.toString(arr1));
        System.out.println();

        // Test Case 2: Single element
        System.out.println("Test Case 2:");
        int arr2[] = {10};
        System.out.println("Original: " + Arrays.toString(arr2));
        q23.rearrange(arr2);
        System.out.println("After rearrange: " + Arrays.toString(arr2));
        System.out.println();

        // Test Case 3: Two elements
        System.out.println("Test Case 3:");
        int arr3[] = {3, 1};
        System.out.println("Original: " + Arrays.toString(arr3));
        q23.rearrange(arr3);
        System.out.println("After rearrange: " + Arrays.toString(arr3));
        System.out.println();

        // Test Case 4: Larger array
        System.out.println("Test Case 4:");
        int arr4[] = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Original: " + Arrays.toString(arr4));
        q23.rearrange(arr4);
        System.out.println("After rearrange: " + Arrays.toString(arr4));
        System.out.println();

        // Test Case 5: Array with negative numbers
        System.out.println("Test Case 5:");
        int arr5[] = {-3, 0, 2, -1, 4};
        System.out.println("Original: " + Arrays.toString(arr5));
        q23.rearrange(arr5);
        System.out.println("After rearrange: " + Arrays.toString(arr5));
    }
}