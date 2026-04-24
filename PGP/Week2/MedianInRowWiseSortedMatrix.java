package PGP.Week2;

public class MedianInRowWiseSortedMatrix {
    public static int median(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        int start = mat[0][0];
        int end = mat[0][cols - 1];

        for (int i = 0; i < rows; i++) {
            start = Math.min(start, mat[i][0]);
            end = Math.max(end, mat[i][cols - 1]);
        }

        int totalElements = rows * cols;
        int medianIndex = totalElements / 2;

        while (start <= end) {
            int assumedMedian = start + (end - start) / 2;
            int lesserElements = findLesserElements(mat, assumedMedian);

            if (lesserElements <= medianIndex) {
                start = assumedMedian + 1;
            } else {
                end = assumedMedian - 1;
            }
        }

        return start;
    }

    private static int findLesserElements(int[][] matrix, int lessElement) {
        int smallerElements = 0;

        for (int[] row : matrix) {
            int start = 0;
            int end = row.length - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (row[mid] <= lessElement) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

            smallerElements += start;
        }

        return smallerElements;
    }

    private static void runTest(int[][] mat, int expected) {
        int result = median(mat);
        System.out.println("matrix median = " + result
                + ", expected = " + expected
                + (result == expected ? " [PASS]" : " [FAIL]") );
    }

    public static void main(String[] args) {
        runTest(new int[][] {
                { 1, 3, 5 },
                { 2, 6, 9 },
                { 3, 6, 9 }
        }, 5);

        runTest(new int[][] {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        }, 5);

        runTest(new int[][] {
                { 1, 10, 20 },
                { 2, 12, 30 },
                { 3, 15, 40 }
        }, 12);

        runTest(new int[][] {
                { 1, 1, 2 },
                { 2, 2, 3 },
                { 3, 3, 4 }
        }, 2);
    }
}