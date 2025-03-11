public class DiagonalSum {
    static int diagonalSum(int[][] Matrix){
        int sum = 0;
        for(int i = 0; i < Matrix.length; i++){
            sum += Matrix[i][i]; 
            if(i != Matrix.length - 1 - i) {
                sum += Matrix[i][Matrix.length - 1 - i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] Matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        int sum = diagonalSum(Matrix);
        System.out.println(sum); 
    }
}
// 1+6+11+16 + 4+7+10+13 = 68