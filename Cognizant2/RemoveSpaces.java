package Cognizant2;

import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        StringBuilder result = new StringBuilder();

        // Loop through each character
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // If not a space, add to result
            if (ch != ' ') {
                result.append(ch);
            }
        }

        // Output
        System.out.println("String without spaces: \"" + result.toString() + "\"");
    }
}

