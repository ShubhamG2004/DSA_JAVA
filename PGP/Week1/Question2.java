public class Question2 {
    static boolean isPrime(int n) {
        // code here
        if(n == 1 || n==2){
            return false;
        }
        boolean isPrime = true;
        for(int i=2;i<n/2;i++){
            if(n % i == 0){
                isPrime = false;
            }
        }
        
        return isPrime;
    }
    public static void main(String[] args) {
        int[] testInputs = {1, 2, 3, 4, 5, 9, 11, 15, 17, 19};
        boolean[] expected = {false, true, true, false, true, false, true, false, true, true};

        for (int i = 0; i < testInputs.length; i++) {
            boolean actual = isPrime(testInputs[i]);
            System.out.println(
                "isPrime(" + testInputs[i] + ") = " + actual +
                " | expected: " + expected[i]
            );
        }
    }
}





/*
Approach:
Handle edge cases, then try dividing n by values from 2 up to n/2.

Explanation:
If any divisor exactly divides n, the number is not prime.
If no divisor is found, the method returns true indicating n is prime.
*/
