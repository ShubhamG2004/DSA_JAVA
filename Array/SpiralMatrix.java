public class SpiralMatrix {
    static void spriralMatrix(int[][] Matrix){
        int top = 0;
        int left =0;
        int m = Matrix.length;
        int n = Matrix[0].length;
        int right = n-1;
        int bottom = m-1;
        int j=0;

        int totalElements = m * n;

        while(totalElements > j){
            // top -> Left to right
            for(int i= left;i<=right && totalElements > j;i++){
                System.out.print(Matrix[top][i]+" ");
                j++;
            }
            top++;

             // right -> top to bottom
             for(int i= top;i<=bottom && totalElements > j;i++){
                System.out.print(Matrix[i][right]+" ");
                j++;
            }
            right--;

            // bottom -> right to left
            for(int i= right;i>=left && totalElements > j;i--){
                System.out.print(Matrix[bottom][i]+" ");
                j++;
            }
            bottom--;

            // left -> bottom to top
            for(int i= bottom;i>=top && totalElements > j;i--){
                System.out.print(Matrix[i][left]+" ");
                j++;
            }
            left++;
        }
    } 
    public static void main(String args[]){
        int[][] Matrix={{2,3,4,},{3,5,8},{12,32,56},{9,6,3}};

        spriralMatrix(Matrix);
    }
}
