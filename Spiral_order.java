import java.util.Scanner;

public class Spiral_order {

    static void printArray(int[][] arr){
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void matrix_order(int[][] a, int r, int c) {
        int topRow = 0, rightCol = c - 1;
        int leftCol = 0, bottomRow = r - 1;
        int totalElements = r * c;
    
        while (totalElements > 0) {
            // Traverse top row from left to right
            for (int i = leftCol; i <= rightCol; i++) {
                System.out.print(a[topRow][i] + " ");
                totalElements--;
            }
            topRow++;
    
            // Traverse right column from top to bottom
            for (int j = topRow; j <= bottomRow; j++) {
                System.out.print(a[j][rightCol] + " ");
                totalElements--;
            }
            rightCol--;
    
            // Traverse bottom row from right to left
            for (int k = rightCol; k >= leftCol; k--) {
                System.out.print(a[bottomRow][k] + " ");
                totalElements--;
            }
            bottomRow--;
    
            // Traverse left column from bottom to top
            for (int p = bottomRow; p >= topRow; p--) {
                System.out.print(a[p][leftCol] + " ");
                totalElements--;
            }
            leftCol++;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Rows of arr1:");
        int r= sc.nextInt();

        System.out.println("Enter the Columns arr1:");
        int c= sc.nextInt();

        int[][] arr1=new int[r][c];

        
        System.out.println("Enter the Element arr1:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Elements Are:");
        printArray(arr1);

        matrix_order(arr1,r,c);
    }
}
