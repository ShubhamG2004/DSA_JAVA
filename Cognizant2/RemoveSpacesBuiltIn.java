package Cognizant2;

import java.util.Scanner;

public class RemoveSpacesBuiltIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        // Remove all whitespace characters (spaces, tabs, newlines)
        String result = input.replaceAll("\\s+", "");

        // Output
        System.out.println("String without spaces: \"" + result + "\"");
    }
}
