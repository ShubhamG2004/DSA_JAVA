package PGP.Week3;

import java.util.Scanner;

public class AddOne {

    // Simple helper that returns x+1
    public static int addOne(int x) {
        return x + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        if (args.length > 0) {
            try {
                n = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid integer argument");
                sc.close();
                return;
            }
        } else {
            System.out.print("Enter integer: ");
            if (!sc.hasNextInt()) {
                System.out.println("No integer provided");
                sc.close();
                return;
            }
            n = sc.nextInt();
        }

        System.out.println("Result: " + addOne(n));
        sc.close();
    }
}
