import java.util.ArrayList;
import java.util.Scanner;

public class PrintAllDivisors {

    public static void print_divisors(int n) {
        printDivisors(n);
    }

    public static void printDivisors(int n) {
        ArrayList<Integer> largerDivisors = new ArrayList<>();
        StringBuilder out = new StringBuilder();

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                out.append(i).append(" ");
                if (i != n / i) {
                    largerDivisors.add(n / i);
                }
            }
        }

        for (int i = largerDivisors.size() - 1; i >= 0; i--) {
            out.append(largerDivisors.get(i)).append(" ");
        }

        System.out.println(out.toString().trim());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDivisors(n);
        sc.close();
    }
}
