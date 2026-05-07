package PGP.Week3;

public class Question14 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int row = 0;
        int col = n-1;

        while(row < m && col >= 0){
            if(matrix[row][col] == target){
                return true;
            }

            else if(matrix[row][col] > target){
                col--;
            }

            else{
                row++;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Question14 q = new Question14();

        int[][] mat1 = {
            {1, 4, 7, 11, 15},
            {2, 5, 8, 12, 19},
            {3, 6, 9, 16, 22},
            {10,13,14,17,24},
            {18,21,23,26,30}
        };

        System.out.println("Test1: target=5, expected=true -> " + q.searchMatrix(mat1, 5));
        System.out.println("Test2: target=20, expected=false -> " + q.searchMatrix(mat1, 20));

        int[][] mat2 = {{-1, 3}};
        System.out.println("Test3: target=3, expected=true -> " + q.searchMatrix(mat2, 3));
        System.out.println("Test4: target=0, expected=false -> " + q.searchMatrix(mat2, 0));

        int[][] mat3 = {{1}};
        System.out.println("Test5: target=1, expected=true -> " + q.searchMatrix(mat3, 1));
        System.out.println("Test6: target=2, expected=false -> " + q.searchMatrix(mat3, 2));
    }
}
