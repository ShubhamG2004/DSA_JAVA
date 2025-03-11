public class DiagonaSum {
    static int diagonalSum(int[][] Matrix){
        int sum =0;
        for(int i=0;i<Matrix.length;i++){
            for(int j=0;j<Matrix[0].length;j++){
                if(i==j){
                    sum += Matrix[i][j];
                }
                else if( (i+j) == Matrix.length-1){
                    sum += Matrix[i][j];
                }
            }
        }

        return sum;
    }
    public static void main(String args[]){
        int[][] Matrix={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};

        int sum = diagonalSum(Matrix);
        System.out.println(sum);
    }
}
18+16=34 + 11+23=45+23=68