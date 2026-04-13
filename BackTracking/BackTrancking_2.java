class BackTrancking_2{
    public static void main(String[] args) {
        int rows=3;
        int column =3;

        boolean isVisited[][] = new boolean[rows][column];
        RatInMaze(0,0,rows-1,column-1,"",isVisited);
    }
    public static void RatInMaze(int sr,int sc, int er, int ec,String s, boolean[][] isVisited){
        if(sr<0  || sc<0) return;
        if(sr>er || sc>ec) return;
        if(isVisited[sr][sc]==true) return;
        if(sr==er && sc ==ec){
            System.out.println(s);
            return;
        }

        // Visit at the box
        isVisited[sr][sc]=true;
        // RightWays
        RatInMaze(sr,sc+1,er,ec,s+"R",isVisited);
        // DownWays
        RatInMaze(sr+1,sc,er,ec,s+"D",isVisited);
        //LeftWyas
        RatInMaze(sr,sc-1,er,ec,s+"L",isVisited);
        // Upways
        RatInMaze(sr-1,sc,er,ec,s+"U",isVisited);

        isVisited[sr][sc]=false;
    }
}