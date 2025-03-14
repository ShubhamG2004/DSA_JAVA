public class Transpose {
    static void makeTranspose(int[][] matrix){
        int transpose[][] = new int[matrix[0].length][matrix.length];

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                transpose[j][i] = matrix[i][j];
            }
        }

        printMatrix(transpose);
    }

    static void printMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int[][] Matrix = {
            {1, 2, 3, 4},
            {5, 10, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 10, 16}
        };
        printMatrix(Matrix);
        System.out.println();
        makeTranspose(Matrix);
    }
}
