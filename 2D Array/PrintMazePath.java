class PrintMazePath{
    public static void RateInMaze(int sr,int sc,int er,int ec,String S){
        if(sr>er || sc > ec )return ;
        if(sr ==er && sc== ec ){
            System.out.println(S);
            return ;
        }
        RateInMaze(sr+1, sc, er, ec, S+"R");
        RateInMaze(sr, sc+1, er, ec,S+"D");
        
    }
    public static void main(String[] args) {
        int row=3;
        int column=3;

        RateInMaze(1,1,row,column,"");
        
    }
}