// shubham gavade

class Solution {
    public int largestPrimeFactor(int n) {
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
}
