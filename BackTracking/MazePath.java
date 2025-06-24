public class MazePath {
    public static void main(String[] args) {
        int rows = 2;
        int cols = 2;
        int count = mazePathCount(1,1,rows,cols);
        System.out.println("Total paths: " + count);
    }
    private static int mazePathCount(int currRow, int currCol, int rows, int cols){
        if(currRow == rows && currCol == cols) {
            return 1; 
        }
        if(currRow > rows || currCol > cols) {
            return 0; 
        }

        int downPaths = mazePathCount(currRow + 1, currCol, rows, cols);
        int rightPaths = mazePathCount(currRow, currCol + 1, rows, cols);
        return downPaths + rightPaths;
    }
}
