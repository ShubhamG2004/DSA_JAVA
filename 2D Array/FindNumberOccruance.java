public class FindNumberOccruance {
    static int findOccurance(int[][] matrix, int target){
        int count =0;

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == target){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] Matrix = {
            {1, 2, 3, 4},
            {5, 10, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 10, 16}
        };

        int sum = findOccurance(Matrix,10);
        System.out.println(sum); 
    }
}
