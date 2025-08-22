package Cognizant2;

import java.util.Scanner;

public class MaxProductPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) arr[i] = sc.nextInt();

        int result[] = findMaxProductPair(arr, N);

        if (result.length > 0) {
            System.out.println(result[0] + " " + result[1]);
        } else {
            System.out.println("No Pair Found!!");
        }
    }

    static int[] findMaxProductPair(int[] arr, int n) {
        int maxProduct = -1;
        int[] result = new int[2];
        boolean found = false;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) { 
                if (arr[i] + arr[j] == 18) {  
                    int product = arr[i] * arr[j];
                    if (product > maxProduct) {
                        maxProduct = product; 
                        result[0] = arr[i];
                        result[1] = arr[j];
                        found = true;
                    }
                }
            }
        }

        return found ? result : new int[]{};
    }
}
