import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question21 {
    
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();

        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        solve(0, board, ans, n);

        return ans;
    }

    public static void main(String[] args) {
        Question21 q = new Question21();
        int n = 4; // test case: 4-queens
        List<List<String>> solutions = q.solveNQueens(n);

        System.out.println("n = " + n + ", solutions = " + solutions.size());

        for (int k = 0; k < solutions.size(); k++) {
            System.out.println("Solution " + (k + 1) + ":");
            for (String row : solutions.get(k)) {
                System.out.println(row);
            }
            System.out.println();
        }
    }

    private void solve(int row, char[][] board,
                       List<List<String>> ans, int n) {

        if (row == n) {
            List<String> temp = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                temp.add(new String(board[i]));
            }

            ans.add(temp);
            return;
        }

        for (int col = 0; col < n; col++) {

            if (isSafe(board, row, col, n)) {

                board[row][col] = 'Q';

                solve(row + 1, board, ans, n);

                board[row][col] = '.';
            }
        }
    }

    private boolean isSafe(char[][] board, int row, int col, int n) {

        // Check upper column
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check upper-left diagonal
        int i = row - 1;
        int j = col - 1;

        while (i >= 0 && j >= 0) {
            if (board[i][j] == 'Q') {
                return false;
            }
            i--;
            j--;
        }

        // Check upper-right diagonal
        i = row - 1;
        j = col + 1;

        while (i >= 0 && j < n) {
            if (board[i][j] == 'Q') {
                return false;
            }
            i--;
            j++;
        }

        return true;
    }
}