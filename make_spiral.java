import java.util.Scanner;

public class make_spiral {

    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] matrix_order(int n) {
        int[][] a = new int[n][n];
        int topRow = 0, rightCol = n - 1;
        int leftCol = 0, bottomRow = n - 1;
        int value = 1; // Start from 1
    
        while (topRow <= bottomRow && leftCol <= rightCol) {
            // Traverse top row from left to right
            for (int i = leftCol; i <= rightCol; i++) {
                a[topRow][i] = value++;
            }
            topRow++;
    
            // Traverse right column from top to bottom
            for (int j = topRow; j <= bottomRow; j++) {
                a[j][rightCol] = value++;
            }
            rightCol--;
    
            // Traverse bottom row from right to left
            for (int k = rightCol; k >= leftCol; k--) {
                a[bottomRow][k] = value++;
            }
            bottomRow--;
    
            // Traverse left column from bottom to top
            for (int p = bottomRow; p >= topRow; p--) {
                a[p][leftCol] = value++;
            }
            leftCol++;
        }
        return a;
    }
    

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of rows and columns:");
            int n = sc.nextInt();
            
            int[][] arr = matrix_order(n);
            printArray(arr);
        }
    }
}
