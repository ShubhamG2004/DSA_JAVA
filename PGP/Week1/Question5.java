// shubham gavade

public class Question5 {
    static int largestPrimeFactor(int n) {
        int maxPrime = -1;

        // Step 1: Remove factor 2
        while (n % 2 == 0) {
            maxPrime = 2;
            n /= 2;
        }

        // Step 2: Check odd factors
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                maxPrime = i;
                n /= i;
            }
        }

        // Step 3: If remaining n is prime
        if (n > 1) {
            maxPrime = n;
        }

        return maxPrime;
    }

    public static void main(String[] args) {
        int[] tests = {2, 5, 6, 10, 21, 315};
        for (int n : tests) {
            System.out.println("largestPrimeFactor(" + n + ") = " + largestPrimeFactor(n));
        }
    }
}





/*
Approach:
Remove factor 2 first, then test odd factors up to sqrt(n), repeatedly dividing when matched.

Explanation:
Every time a prime factor divides n, store it in maxPrime and reduce n.
After the loop, if n > 1, that remaining n itself is the largest prime factor.
*/
