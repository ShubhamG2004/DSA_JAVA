public class Question4 {
    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit * digit;
            n /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        int[] testInputs = {153, 372, 100, 371};
        boolean[] expected = {true, false, false, true};

        for (int i = 0; i < testInputs.length; i++) {
            boolean actual = isArmstrong(testInputs[i]);
            System.out.println(
                "isArmstrong(" + testInputs[i] + ") = " + actual +
                " | expected: " + expected[i]
            );
        }
    }
}





/*
Approach:
Compute the sum of cubes of digits and compare it with the original number.

Explanation:
An Armstrong number (for 3-digit logic here) is equal to the sum of cube of its digits.
The method builds this sum and returns true only when sum == original.
*/
