import java.util.Scanner;
public class Representation {
    static void SearchKey(int[][] Matrix, int Key) {
        int m = Matrix.length;
        int n = Matrix[0].length;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (Matrix[i][j] == Key) {
                    System.out.println("Key found at: (" + i + ", " + j + ")");
                    return;
                }
            }
        }
        System.out.println("Key not found!");
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int m = 3;
        int n = 3;

        int[][] Matrix = new int[m][n];

        System.out.println("Enter the Element:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                Matrix[i][j] = sc.nextInt();
                // sc.close();
            }
        }

        System.out.println("Element:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(Matrix[i][j]+" ");
            }
            System.out.println();
        }

        SearchKey(Matrix, 34);
    }
}
