package PGP.Week2;

public class Question21 {

    public int findKthNumber(int m, int n, int k) {
        int start = 1;
        int end = m * n;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (countLessNum(mid, m, n) >= k) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    public int countLessNum(int mid, int m, int n) {
        int count = 0;

        for (int i = 1; i <= m; i++) {
            count += Math.min(n, mid / i);
        }

        return count;
    }

    private static void runTest(int m, int n, int k, int expected) {
        Question21 solution = new Question21();
        int output = solution.findKthNumber(m, n, k);
        System.out.println("m=" + m + ", n=" + n + ", k=" + k);
        System.out.println("Output:   " + output);
        System.out.println("Expected: " + expected);
        System.out.println("Result:   " + (output == expected ? "PASS" : "FAIL"));
        System.out.println();
    }

    public static void main(String[] args) {
        runTest(3, 3, 5, 3);
        runTest(2, 3, 6, 6);
        runTest(5, 5, 12, 6);
    }
}
