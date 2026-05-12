package PGP.Week3;

import java.util.HashSet;

public class Question22 {
    boolean findSwapValues(int[] a, int[] b) {
        // Your code goes here
        int sumA = 0;
        int sumB = 0;
        
        for(int el:a) sumA+=el;
        for(int el:b) sumB+=el;
        
        int diff = sumA - sumB;
        
        if(diff %2 !=0){
            return false;
        }
        
        diff = diff /2;
        HashSet<Integer> set = new HashSet<>();
        
        for(int num:a){
            set.add(num);
        }
        
        for(int num:b){
            int x = num + diff;
            
            if(set.contains(x)) return true;
        }
        
        return false;
    }

    public static void main(String[] args) {
        Question22 solution = new Question22();

        // Test Case 1: Valid swap exists
        int[] a1 = {1, 5, 7, 1};
        int[] b1 = {2, 5, 1, 6};
        System.out.println("Test 1 - a: {1, 5, 7, 1}, b: {2, 5, 1, 6}");
        System.out.println("Expected: true, Got: " + solution.findSwapValues(a1, b1));

        // Test Case 2: No valid swap
        int[] a2 = {1, 2, 3};
        int[] b2 = {4, 5, 6};
        System.out.println("\nTest 2 - a: {1, 2, 3}, b: {4, 5, 6}");
        System.out.println("Expected: false, Got: " + solution.findSwapValues(a2, b2));

        // Test Case 3: Already equal sums
        int[] a3 = {5, 5};
        int[] b3 = {5, 5};
        System.out.println("\nTest 3 - a: {5, 5}, b: {5, 5}");
        System.out.println("Expected: true, Got: " + solution.findSwapValues(a3, b3));

        // Test Case 4: Single element arrays
        int[] a4 = {10};
        int[] b4 = {8};
        System.out.println("\nTest 4 - a: {10}, b: {8}");
        System.out.println("Expected: true, Got: " + solution.findSwapValues(a4, b4));

        // Test Case 5: Larger difference
        int[] a5 = {1, 5, 7, 3};
        int[] b5 = {2, 5, 1, 4};
        System.out.println("\nTest 5 - a: {1, 5, 7, 3}, b: {2, 5, 1, 4}");
        System.out.println("Expected: true, Got: " + solution.findSwapValues(a5, b5));

        // Test Case 6: Odd difference (impossible to balance)
        int[] a6 = {1, 2};
        int[] b6 = {3, 4};
        System.out.println("\nTest 6 - a: {1, 2}, b: {3, 4}");
        System.out.println("Expected: false, Got: " + solution.findSwapValues(a6, b6));

        // Test Case 7: Zero values
        int[] a7 = {0, 5};
        int[] b7 = {2, 3};
        System.out.println("\nTest 7 - a: {0, 5}, b: {2, 3}");
        System.out.println("Expected: true, Got: " + solution.findSwapValues(a7, b7));
    }
}
