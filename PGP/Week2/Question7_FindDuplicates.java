package PGP.Week2;

import java.util.*;

public class Question7_FindDuplicates {
    static class Solution {
        public ArrayList<Integer> findDuplicates(int[] arr) {
            // Using HashSet to track seen elements
            Set<Integer> seen = new HashSet<>();
            ArrayList<Integer> result = new ArrayList<>();
            
            for (int num : arr) {
                if (seen.contains(num)) {
                    result.add(num);
                } else {
                    seen.add(num);
                }
            }
            
            return result;
        }
    }

    private static void runTest(Solution solver, int[] arr, ArrayList<Integer> expected) {
        ArrayList<Integer> result = solver.findDuplicates(arr);
        boolean passed = result.equals(expected);

        System.out.println("arr=" + Arrays.toString(arr)
                + " -> result=" + result
                + ", expected=" + expected
                + (passed ? " [PASS]" : " [FAIL]"));
    }

    public static void main(String[] args) {
        Solution solver = new Solution();

        // Test case 1: Multiple duplicates
        ArrayList<Integer> test1Expected = new ArrayList<>(Arrays.asList(2));
        runTest(solver, new int[] { 1, 2, 2, 3 }, test1Expected);

        // Test case 2: Multiple different duplicates
        ArrayList<Integer> test2Expected = new ArrayList<>(Arrays.asList(2, 3));
        runTest(solver, new int[] { 1, 2, 2, 3, 3, 4 }, test2Expected);

        // Test case 3: No duplicates
        ArrayList<Integer> test3Expected = new ArrayList<>();
        runTest(solver, new int[] { 1, 2, 3, 4 }, test3Expected);

        // Test case 4: All duplicates
        ArrayList<Integer> test4Expected = new ArrayList<>(Arrays.asList(1, 1, 1));
        runTest(solver, new int[] { 1, 1, 1, 1 }, test4Expected);

        // Test case 5: Empty array
        ArrayList<Integer> test5Expected = new ArrayList<>();
        runTest(solver, new int[] {}, test5Expected);

        // Test case 6: Single element
        ArrayList<Integer> test6Expected = new ArrayList<>();
        runTest(solver, new int[] { 5 }, test6Expected);

        // Test case 7: Duplicates at end
        ArrayList<Integer> test7Expected = new ArrayList<>(Arrays.asList(3, 4));
        runTest(solver, new int[] { 1, 2, 3, 3, 4, 4 }, test7Expected);
    }
}
