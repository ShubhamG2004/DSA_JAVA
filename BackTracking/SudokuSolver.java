class SudokuSolver {
    public boolean isValid(char[][] board, int row, int col, char num){
        // check column
        for(int i = 0; i < 9; i++){
            if(board[i][col] == num) return false;
        }

        // check row
        for(int i = 0; i < 9; i++){
            if(board[row][i] == num) return false;
        }

        // check 3x3 grid
        int sRow = row / 3 * 3;
        int sCol = col / 3 * 3;
        for(int i = sRow; i < sRow + 3; i++){
            for(int j = sCol; j < sCol + 3; j++){
                if(board[i][j] == num) return false;
            }
        }

        return true;
    }

    public boolean helper(char[][] board, int row, int col){
        if(row == 9) return true;

        int nrow = 0, ncol = 0;

        if(col != 8){
            nrow = row;
            ncol = col + 1;
        } else {
            nrow = row + 1;
            ncol = 0;
        }

        if(board[row][col] != '.'){
            return helper(board, nrow, ncol);
        } else {
            for(char i = '1'; i <= '9'; i++){
                if(isValid(board, row, col, i)){
                    board[row][col] = i;
                    if(helper(board, nrow, ncol)) return true;
                    board[row][col] = '.'; 
                }
            }
        }

        return false; 
    }

    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }
    public static void main(String[] args) {
        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        SudokuSolver solver = new SudokuSolver();
        solver.solveSudoku(board);

        printBoard(board);
    }

    public static void printBoard(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
