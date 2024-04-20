import java.util.Scanner;
import java.util.*;

public class Abcd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        while (T-- > 0) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int C = scanner.nextInt();
            int D = scanner.nextInt();
            
            System.out.println(minBagsNeeded(A, B, C, D));
        }
        
        scanner.close();
    }
    
    public static int minBagsNeeded(int A, int B, int C, int D) {
        int[] gifts = {A, B, C};
        Arrays.sort(gifts);
        
        int bagsNeeded = 0;
        
        if (gifts[2] <= D) {
            bagsNeeded = 1;
        } else if (gifts[1] + gifts[2] <= D) {
            bagsNeeded = 2;
        } else if (gifts[0] + gifts[1] + gifts[2] <= D) {
            bagsNeeded = 3;
        }
        
        return bagsNeeded;
    }
}
