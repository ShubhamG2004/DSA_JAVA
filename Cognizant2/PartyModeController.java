package Cognizant2;

import java.util.Scanner;

public class PartyModeController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: current button state (integer)
        System.out.print("Enter the current button state (0-63): ");
        int input = sc.nextInt();

        // Masks for toggling 1st, 3rd, and 5th bits (from right, 1-based)
        int mask = (1 << 0) | (1 << 2) | (1 << 4);  // bits 1, 3, 5 → positions 0, 2, 4

        // Toggle the bits using XOR
        int result = input ^ mask;

        // Output
        System.out.println("New button state: " + result);
    }
}
