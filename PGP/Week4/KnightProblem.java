public class KnightProblem {
    public boolean helper(int[][] grid, int row, int col, int num){
        int rows = grid.length;
        int cols = grid[0].length;
        int i;
        int j;
        // base case: reached highest number
        if(num == rows * cols - 1) return true;

        // all 8 knight moves as a 2D array of (dr, dc)
        int[][] moves = {
            {2, 1}, {1, 2}, {-1, 2}, {-2, 1},
            {-2, -1}, {-1, -2}, {1, -2}, {2, -1}
        };

        for (int[] mv : moves) {
            i = row + mv[0];
            j = col + mv[1];
            if (i >= 0 && i < rows && j >= 0 && j < cols) {
                if (grid[i][j] == num + 1) {
                    if (helper(grid, i, j, num+1)) return true;
                }
            }
        }

        return false;
    }

    
    public boolean checkValidGrid(int[][] grid) {
        if(grid == null || grid.length == 0 || grid[0].length == 0) return false;
        if(grid[0][0] != 0) return false;
        return helper(grid,0,0,0);
    }

    public static void main(String[] args) {
        KnightProblem kp = new KnightProblem();

        int[][] trivial = {{0}};
        System.out.println("trivial (1x1) => expected true: " + kp.checkValidGrid(trivial));

        int[][] wrongStart = {
            {1, 0},
            {2, 3}
        };
        System.out.println("wrongStart => expected false: " + kp.checkValidGrid(wrongStart));

        int[][] badSeq = {
            {0, 2},
            {1, 3}
        };
        System.out.println("badSeq => expected false: " + kp.checkValidGrid(badSeq));

        int[][] tour8x8 = {
            {0,59,38,33,30,17,8,63},
            {37,34,31,60,9,62,29,16},
            {58,1,36,39,32,27,18,7},
            {35,48,41,26,61,10,15,28},
            {42,57,2,49,40,23,6,19},
            {47,50,45,54,25,20,11,14},
            {56,43,52,3,22,13,24,5},
            {51,46,55,44,53,4,21,12}
        };
        System.out.println("8x8 tour => expected true: " + kp.checkValidGrid(tour8x8));
    }
}
