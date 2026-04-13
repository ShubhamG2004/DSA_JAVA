import java.util.Scanner;

public class brute_sum {

    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int matrix_sum(int[][] arr,int r1,int c1,int r2,int c2) {
        int sum=0;
        
        for(int i=r1;i<=c1;i++){
            for(int j=r2;j<=c2;j++){
                sum += arr[i][j];  
            }
        }
        return sum;
    }
    

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of rows:");
            int r = sc.nextInt();

            System.out.println("Enter the numbers of columns:");
            int c = sc.nextInt();

            int[][] arr=new int[r][c];
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    arr[i][j]=sc.nextInt();
                }
            }
            System.out.println("Elements:");       
            System.out.println();

            printArray(arr);

            System.out.println("Enter the indexes:");
            int r1=sc.nextInt();
            int c1=sc.nextInt();
            int r2=sc.nextInt();
            int c2=sc.nextInt();

            System.out.println("Sum of the Array:");
            int sum=matrix_sum(arr, r1,c1,r2, c2);

            System.out.println(sum);
        }
    }
}
