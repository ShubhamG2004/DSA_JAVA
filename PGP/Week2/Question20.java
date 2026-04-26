package PGP.Week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Question20 {

    public ArrayList<Integer> sortByFreq(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        Integer[] temp = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        Arrays.sort(temp, (a, b) -> {
            if (freq.get(a).equals(freq.get(b))) {
                return a - b;
            }
            return freq.get(b) - freq.get(a);
        });

        ArrayList<Integer> res = new ArrayList<>();
        for (int num : temp) {
            res.add(num);
        }

        return res;
    }

    private static void runTest(int[] input, Integer[] expected) {
        Question20 solution = new Question20();
        ArrayList<Integer> output = solution.sortByFreq(input);
        System.out.println("Input:     " + Arrays.toString(input));
        System.out.println("Output:    " + output);
        System.out.println("Expected:  " + Arrays.toString(expected));
        System.out.println("Result:    " + (output.equals(new ArrayList<>(Arrays.asList(expected))) ? "PASS" : "FAIL"));
        System.out.println();
    }

    public static void main(String[] args) {
        runTest(new int[] {5, 5, 4, 6, 4}, new Integer[] {4, 4, 5, 5, 6});
        runTest(new int[] {9, 9, 9, 2, 5}, new Integer[] {9, 9, 9, 2, 5});
        runTest(new int[] {3, 3, 1, 2, 2, 2}, new Integer[] {2, 2, 2, 3, 3, 1});
    }
}
