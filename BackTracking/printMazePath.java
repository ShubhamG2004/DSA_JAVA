public class printMazePath {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        System.out.println();
        printMazePath(1, 1, rows, cols, "");
    }
    public static void printMazePath(int currRow, int currCol, int rows, int cols, String path) {
        if (currRow == rows && currCol == cols) {
            System.out.println(path);
            return;
        }
        if (currRow > rows || currCol > cols) {
            return;
        }

        // Move Down
        printMazePath(currRow + 1, currCol, rows, cols, path + "D");
        // Move Right
        printMazePath(currRow, currCol + 1, rows, cols, path + "R");
    }
}
