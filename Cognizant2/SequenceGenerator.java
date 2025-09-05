import java.util.*;

public class SequenceGenerator {

    public static int[] generateSequence(int N, int[] firstSix) {
        int[] result = new int[N];

        // Copy first min(N, 6) terms
        for (int i = 0; i < Math.min(N, 6); i++) {
            result[i] = firstSix[i];
        }

        for (int i = 6; i < N; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input N
        int N = sc.nextInt();

        // Input first 6 terms
        int[] firstSix = new int[6];
        for (int i = 0; i < 6; i++) {
            firstSix[i] = sc.nextInt();
        }

        // Generate sequence
        int[] ans = generateSequence(N, firstSix);

        // Print result
        for (int i = 0; i < ans.length; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(ans[i]);
        }
    }
}
