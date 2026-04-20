public class Question3 {
    static int countDigitsDividingNumber(int n) {
        int count = 0;
        int original = n;

        while (n > 0) {
            int digit = n % 10;
            if (digit != 0 && original % digit == 0) {
                count++;
            }
            n /= 10;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] testInputs = {12, 2446, 23};
        int[] expected = {2, 1, 0};

        for (int i = 0; i < testInputs.length; i++) {
            int actual = countDigitsDividingNumber(testInputs[i]);
            System.out.println(
                "countDigitsDividingNumber(" + testInputs[i] + ") = " + actual +
                " | expected: " + expected[i]
            );
        }
    }
}





/*
Approach:
Traverse each digit of n and check whether it divides the original number.

Explanation:
Extract digits using modulo and division, skip digit 0, and increment count only when
original % digit == 0. Return the total count at the end.
*/
