public class printNqueen {
    public static void main(String[] args) {
        int n = 4; // Size of the chessboard
        char[][] board = new char[n][n]; 
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = '.';
            }
        }
        placeNQueens(board, 0, n);
    }
    private static void placeNQueens(char[][] board, int rows, int n) {
        if(rows == n){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        for(int j=0;j<n;j++){
            if(isSafe(board, rows, j, n)) {
                board[rows][j] = 'Q';
                placeNQueens(board, rows+1, n);
                board[rows][j] = '.'; 
            }
        }
    }

    private static boolean isSafe(char[][] board, int row, int col, int n) {
        // Check column
        for(int i=0;i<row;i++){
            if(board[i][col] == 'Q') {
                return false;
            }
        }
        // Check left diagonal
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }
        // Check right diagonal
        for(int i=row-1, j=col+1; i>=0 && j<n; i--, j++) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
}
