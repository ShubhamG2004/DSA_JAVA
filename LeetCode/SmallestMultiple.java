/**
 * Problem: Find the smallest positive integer that is a multiple of both 2 and n.
 * 
 * Solution: The answer is the LCM (Least Common Multiple) of 2 and n.
 * - If n is even: LCM(2, n) = n (since n is already divisible by 2)
 * - If n is odd: LCM(2, n) = 2 * n
 * 
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

public class SmallestMultiple {
    
    /**
     * Approach 1: Using modulo operator (Most Efficient)
     */
    public static int smallestMultiple_Approach1(int n) {
        // If n is even, return n; otherwise return 2*n
        if (n % 2 == 0) {
            return n;
        } else {
            return 2 * n;
        }
    }
    
    /**
     * Approach 2: Using bitwise AND operator
     * Even numbers have last bit as 0, odd numbers have last bit as 1
     */
    public static int smallestMultiple_Approach2(int n) {
        if ((n & 1) == 0) {  // n is even
            return n;
        } else {  // n is odd
            return 2 * n;
        }
    }
    
    /**
     * Approach 3: Using left shift (multiply by 2)
     */
    public static int smallestMultiple_Approach3(int n) {
        if (n % 2 == 0) {
            return n;
        } else {
            return n << 1;  // Left shift by 1 is equivalent to multiplying by 2
        }
    }
    
    /**
     * Approach 4: Using GCD formula (LCM(a,b) = a*b / GCD(a,b))
     */
    public static int smallestMultiple_Approach4(int n) {
        int gcd = gcd(2, n);
        return (2 * n) / gcd;
    }
    
    /**
     * Helper method to calculate GCD using Euclidean algorithm
     */
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    /**
     * Test cases
     */
    public static void main(String[] args) {
        // Test case 1: n = 5 (odd)
        System.out.println("Test 1: n = 5");
        System.out.println("Expected: 10");
        System.out.println("Approach 1: " + smallestMultiple_Approach1(5));
        System.out.println("Approach 2: " + smallestMultiple_Approach2(5));
        System.out.println("Approach 3: " + smallestMultiple_Approach3(5));
        System.out.println("Approach 4: " + smallestMultiple_Approach4(5));
        System.out.println();
        
        // Test case 2: n = 6 (even)
        System.out.println("Test 2: n = 6");
        System.out.println("Expected: 6");
        System.out.println("Approach 1: " + smallestMultiple_Approach1(6));
        System.out.println("Approach 2: " + smallestMultiple_Approach2(6));
        System.out.println("Approach 3: " + smallestMultiple_Approach3(6));
        System.out.println("Approach 4: " + smallestMultiple_Approach4(6));
        System.out.println();
        
        // Additional test cases
        System.out.println("Test 3: n = 1 (odd)");
        System.out.println("Expected: 2");
        System.out.println("Approach 1: " + smallestMultiple_Approach1(1));
        System.out.println();
        
        System.out.println("Test 4: n = 8 (even)");
        System.out.println("Expected: 8");
        System.out.println("Approach 1: " + smallestMultiple_Approach1(8));
        System.out.println();
        
        System.out.println("Test 5: n = 150 (even)");
        System.out.println("Expected: 150");
        System.out.println("Approach 1: " + smallestMultiple_Approach1(150));
    }
}
