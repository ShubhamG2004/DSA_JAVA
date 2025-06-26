public class printNqueen {
    public static void main(String[] args) {
        int n = 5; // Size of the chessboard
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
       for(int i=0;i<n;i++){
            if(board[i][col] == 'Q'){
                return false;
            }
       }
         // check row
       for(int i=0;i<n;i++){
            if(board[row][i] == 'Q'){
                return false;
            }
       }

         // check North-East diagonal
        int i =row, j = col;
        while(i >= 0 && j < n) {
            if(board[i][j] == 'Q') {
                return false;
            }
            i--;
            j++;
        }

        // check South-East diagonal
        i =row;
        j = col;
        while(i < n && j < n) {
            if(board[i][j] == 'Q') {
                return false;
            }
            i++;
            j++;
        }

        // check South-West diagonal
        i =row;
        j = col;
        while(i < n && j >= 0) {
            if(board[i][j] == 'Q') {
                return false;
            }
            i++;
            j--;
        }

        // check North-West diagonal
        i =row;
        j = col;
        while(i >= 0 && j >= 0) {
            if(board[i][j] == 'Q') {
                return false;
            }
            i--;
            j--;
        }

        return true;
    }
}
