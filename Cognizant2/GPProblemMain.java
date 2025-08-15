package Cognizant2;

import java.util.Scanner;

public class GPProblemMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input values
        int a = sc.nextInt(); // first term
        int r = sc.nextInt(); // common ratio
        int n = sc.nextInt(); // term number
        
        // Calculate nth term of G.P.
        long term = (long)(a * Math.pow(r, n - 1));
        
        // Output result
        System.out.println(term);
        
        sc.close();
    }
}
