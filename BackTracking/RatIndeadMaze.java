public class RatIndeadMaze {
    public static void main(String[] args) {
        int rows =3;
        int cols =3;
        int[][] maze = {
            {1, 0, 1},
            {1, 1, 0},
            {0, 1, 1}
        };
        System.out.println("Paths in the dead maze:");
        inDeadMaze(0, 0, rows-1, cols-1, maze, "");
    }
    private static void inDeadMaze(int stRow, int stCol, int edRows, int edCols, int[][] maze, String path) {
      
        if (stRow > edRows || stCol > edCols ) {
            return;
        }
        if (stRow == edRows && stCol == edCols ) {
            System.out.println(path);
            return;
        }

        if(maze[stRow][stCol] == 0) {
            return; 
        }


        // Move Down
        inDeadMaze(stRow + 1, stCol, edRows, edCols, maze, path + "D");
        // Move Right
        inDeadMaze(stRow, stCol + 1, edRows, edCols, maze, path + "R");
        
    }
}
