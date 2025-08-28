package Cognizant2;

import java.util.Scanner;

public class RemoveVowelsManual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        String result = "";

        // Loop through each character
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if character is a vowel
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' &&
                ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
                result += ch; // add non-vowel characters
            }
        }

        // Output
        System.out.println("String without vowels: \"" + result + "\"");
    }
}
