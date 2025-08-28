package Cognizant2;

import java.util.Scanner;

public class ReverseStringQues{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String:");
        String input = sc.nextLine();

        String reverseString = new StringBuilder(input).reverse().toString();

        System.out.println("Reversed String: \"" + reverseString + "\"");
    }
}