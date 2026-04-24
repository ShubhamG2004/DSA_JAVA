package PGP.Week2;

public class Question13 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0) return false;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int r = 0;
        int c = cols-1;
        while(r < rows && c >= 0){
            if(matrix[r][c] == target){
                return true;
            }
            else if(matrix[r][c] > target){
                c = c -1;
            }
            else{
                r = r+1;
            }
        }

        return false;
    }

    private static void runTest(Question13 solver, int[][] matrix, int target, boolean expected) {
        boolean result = solver.searchMatrix(matrix, target);
        System.out.println("target=" + target
                + " -> result=" + result
                + ", expected=" + expected
                + (result == expected ? " [PASS]" : " [FAIL]"));
    }

    public static void main(String[] args) {
        Question13 solver = new Question13();

        int[][] matrix1 = {
                { 1, 4, 7, 11 },
                { 2, 5, 8, 12 },
                { 3, 6, 9, 16 }
        };
        runTest(solver, matrix1, 8, true);

        int[][] matrix2 = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };
        runTest(solver, matrix2, 10, false);
    }
}
