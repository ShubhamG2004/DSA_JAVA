class BackTrancking_1{
    public static int RateInMaze(int sr,int sc,int er,int ec){
        int rightways = RateInMaze(1, sc+1, er, ec);
        int downways = RateInMaze(sr+1, sc, er, ec);
        int totalways = rightways + downways;
        return totalways;
    }
    public static void main(String[] args) {
        int row=2;
        int column=2;

        int count = RateInMaze(1,1,row,column);
        System.out.println(count);
    }
}