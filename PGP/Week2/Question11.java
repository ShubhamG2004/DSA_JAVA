package PGP.Week2;

public class Question11 {
    public int kthSmallest(int[][] matrix, int k) {
        int row = matrix.length;
        int col = matrix[0].length;

        int start = matrix[0][0];
        int end = matrix[row - 1][col - 1];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int lessElement = findLessElement(matrix, mid);

            if (lessElement < k) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }

    public int findLessElement(int[][] matrix, int isEligibleNum) {
        int lessNumbers = 0;

        for (int i = 0; i < matrix.length; i++) {
            int start = 0;
            int end = matrix[0].length - 1;

            if (matrix[i][0] > isEligibleNum) {
                break;
            }

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (matrix[i][mid] <= isEligibleNum) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

            lessNumbers += start;
        }

        return lessNumbers;
    }

    private static void runTest(Question11 solver, int[][] matrix, int k, int expected) {
        int result = solver.kthSmallest(matrix, k);
        boolean passed = result == expected;

        System.out.println("k=" + k
                + " -> result=" + result
                + ", expected=" + expected
                + (passed ? " [PASS]" : " [FAIL]"));
    }

    public static void main(String[] args) {
        Question11 solver = new Question11();

        int[][] matrix1 = {
                { 1, 5, 9 },
                { 10, 11, 13 },
                { 12, 13, 15 }
        };
        runTest(solver, matrix1, 8, 13);

        int[][] matrix2 = {
                { -5 }
        };
        runTest(solver, matrix2, 1, -5);

        int[][] matrix3 = {
                { 1, 2 },
                { 1, 3 }
        };
        runTest(solver, matrix3, 2, 1);

        int[][] matrix4 = {
                { 1, 3, 5 },
                { 6, 7, 12 },
                { 11, 14, 14 }
        };
        runTest(solver, matrix4, 6, 11);
    }
}
