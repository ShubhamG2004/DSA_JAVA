import java.util.*;

public class Solution {

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
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] inputArray = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            inputArray[i] = scanner.nextInt();
        }

        int result = solution.smallestMissingEven(size, inputArray);
        System.out.println("Smallest Missing Even = " + result);
    }
}
