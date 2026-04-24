package PGP.Week2;

public class Question14 {
    
    public int nthUglyNumber(int n, int a, int b, int c) {
        
        long low = 1;
        long high = 2_000_000_000L;

        while (low < high) {
            long mid = low + (high - low) / 2;

            long count = countUgly(mid, a, b, c);

            if (count < n) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return (int) low;
    }

    private long countUgly(long x, long a, long b, long c) {
        long ab = lcm(a, b);
        long bc = lcm(b, c);
        long ac = lcm(a, c);
        long abc = lcm(a, bc);

        return (x / a) + (x / b) + (x / c)
             - (x / ab) - (x / bc) - (x / ac)
             + (x / abc);
    }

    private long gcd(long x, long y) {
        while (y != 0) {
            long temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    private long lcm(long x, long y) {
        return (x / gcd(x, y)) * y;
    }

    private static void runTest(Question14 solver, int n, int a, int b, int c, int expected) {
        int result = solver.nthUglyNumber(n, a, b, c);
        System.out.println("n=" + n + ", a=" + a + ", b=" + b + ", c=" + c
                + " -> result=" + result
                + ", expected=" + expected
                + (result == expected ? " [PASS]" : " [FAIL]"));
    }

    public static void main(String[] args) {
        Question14 solver = new Question14();

        runTest(solver, 3, 2, 3, 5, 4);
        runTest(solver, 4, 2, 3, 4, 6);
    }
}
