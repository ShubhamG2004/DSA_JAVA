public class RatInDeadMazeFourDire {
    public static void main(String[] args) {
        int rows =3;
        int cols =3;
        int[][] maze = {
            {1, 0, 1},
            {1, 1, 1},
            {0, 1, 1}
        };
        boolean [][] isVisited = new boolean[rows][cols];
        System.out.println("Paths in the dead maze:");
        inDeadMaze(0, 0, rows-1, cols-1, maze, "",isVisited);

    }
    private static void inDeadMaze(int stRow, int stCol, int edRows, int edCols, int[][] maze, String path, boolean[][] isVisited ) {
        if(stRow < 0 || stCol < 0){
            return;
        }
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

        if(isVisited[stRow][stCol]) {
            return; 
        }
        isVisited[stRow][stCol] = true;
        // Move Down
        inDeadMaze(stRow + 1, stCol, edRows, edCols, maze, path + "D",isVisited);
        // Move Right
        inDeadMaze(stRow, stCol + 1, edRows, edCols, maze, path + "R",isVisited);

        // Move Up
        inDeadMaze(stRow - 1, stCol, edRows, edCols, maze, path + "U", isVisited);
        // Move Left
        inDeadMaze(stRow, stCol - 1, edRows, edCols, maze, path + "L", isVisited);

        // Backtrack
        isVisited[stRow][stCol] = false;
    }
}
