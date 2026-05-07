package PGP.Week3;

public class Question13 {
     public static long sumSubmatrices(int[][] mat) {

        int n = mat.length;
        int m = mat[0].length;

        long sum = 0;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                long contribution =
                        (long) mat[i][j]
                        * (i + 1)
                        * (j + 1)
                        * (n - i)
                        * (m - j);

                sum += contribution;
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        int[][] mat = {
                {1, 1},
                {1, 1}
        };

        System.out.println(sumSubmatrices(mat));
    }
}
