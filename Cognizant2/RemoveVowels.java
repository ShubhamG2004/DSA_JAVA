package Cognizant2;

import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        // Replace all vowels (a, e, i, o, u, both cases)
        String result = input.replaceAll("[AEIOUaeiou]", "");

        // Output
        System.out.println("String without vowels: \"" + result + "\"");
    }
}
