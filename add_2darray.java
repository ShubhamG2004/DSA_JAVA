import java.util.Scanner;

public class add_2darray {
    static void printArray(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void matrix_add(int[][] a, int r,int c, int[][] b, int r1, int c1){
        int[][] ans=new int[r][c]; 
        if(r!=r1 || c!=c1)
        {
            System.out.println("no addition!!1");
        }  
        else{   
            

            for(int i=0;i<a.length;i++)
            {
                for(int j=0;j<a[i].length;j++)
                {
                    ans[i][j]=a[i][j] + b[i][j];
                }
            }
        }
        printArray(ans);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row 1:");
        int r=sc.nextInt();

        System.out.println("Enter the column 1:");
        int c=sc.nextInt();

        int[][] arr=new int[r][c];
        System.out.println("Enter the Element:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter the row 2:");
        int r1=sc.nextInt();

        System.out.println("Enter the column 2:");
        int c1=sc.nextInt();

        int[][] arr1=new int[r1][c1];
        System.out.println("Enter the Element::");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter the Frist Arr:");
        printArray(arr);

        System.out.println("Enter the Frist Arr1:");
        printArray(arr1);

        System.out.println("Addition Of Matrix is:");
        matrix_add(arr,r,c,arr1,r1,c1);
    }
}
