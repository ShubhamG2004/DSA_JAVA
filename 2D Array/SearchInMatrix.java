public class SearchInMatrix {
    static void MatrixSearch(int[][] Matrix, int Key){
        int row =0, col = Matrix[0].length-1;
        
        while(row < Matrix.length && col >= 0){
            if(Matrix[row][col] == Key){
                System.out.println("Found at: " + row + ", " + col);
                return;
            }
            if(Key < Matrix[row][col]){
              col--;  
            }
            else{
                row++;
            }
        }
        System.out.println("Not Found");
    }
    public static void main(String[] args) {
        int[][] Matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        MatrixSearch(Matrix, 3);
        
    }
}
