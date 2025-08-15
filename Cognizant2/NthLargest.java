package Cognizant2;

import java.util.Arrays;
import java.util.Collections;

public class NthLargest {
    public static void main(String[] args) {
        int[] arr = {10, 20, 4, 45, 99, 6};
        int n = 3; // Find 3rd largest number

        // Sort in descending order
        Arrays.sort(arr);

        if (n <= arr.length) {
            System.out.println(n + "th largest number is: " + arr[arr.length - n +1]);
        } else {
            System.out.println("n is larger than array length!");
        }
    }
}
