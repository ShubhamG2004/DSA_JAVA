package Cognizant2;

import java.util.Scanner;

public class FelllisFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(fellisFunction(N));
    }
    static int fellisFunction(int N){
        int MOD = 1000000007;
        if(N==0 || N == 1) return 1;

        int[] f = new int[N+1];
        f[0]= f[1] = 1;

        for(int n=2;n<=N;n++){
            f[n] = (f[n-1] + 7*f[n-2]+(n/4)) % MOD;
        }

        return f[N];
    }
}
