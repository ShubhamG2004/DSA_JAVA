import java.util.Scanner;

public class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int x = scanner.nextInt();
            int totalDistance = 2 * x * 5; 
            System.out.println(totalDistance);
        }

        scanner.close();
    }
}
