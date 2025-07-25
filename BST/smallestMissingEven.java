import java.util.*;

public class smallestMissingEven {

    public int smallestMissingEven(int input1, int[] input2) {
        Set<Integer> evenSet = new HashSet<>();
        int maxEven = Integer.MIN_VALUE;

        for (int i = 0; i < input1; i++) {
            if (input2[i] % 2 == 0) {
                evenSet.add(input2[i]);
                maxEven = Math.max(maxEven, input2[i]);
            }
        }

        if (maxEven == Integer.MIN_VALUE) {
            return 2;
        }

        for (int i = 2; i <= maxEven; i += 2) {
            if (!evenSet.contains(i)) {
                return i;
            }
        }

        return maxEven + 2; 
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Random rand = new Random();

        for (int t = 1; t <= 100; t++) {
            int size = rand.nextInt(20) + 1;
            int[] testArray = new int[size];

            System.out.print("Test Case " + t + ": ");
            System.out.print("Input Array: [");
            for (int i = 0; i < size; i++) {
                testArray[i] = rand.nextInt(50) + 1;
                System.out.print(testArray[i] + (i < size - 1 ? ", " : ""));
            }
            System.out.print("] -> ");

            int result = solution.smallestMissingEven(size, testArray);
            System.out.println("Smallest Missing Even = " + result);
        }
    }
}
