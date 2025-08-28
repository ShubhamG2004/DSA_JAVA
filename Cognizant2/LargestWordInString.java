package Cognizant2;

import java.util.*;

public class LargestWordInString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");

        String str = sc.nextLine();
        String[] words = str.trim().split("\\s+");

        String largestWord = "";
        int maxLength = 0;

        for(String word : words){
            if(word.length() > maxLength){
                maxLength = word.length();
                largestWord = word;
            }
        }

        System.out.println("Largest word: \"" + largestWord + "\"");
    }
}