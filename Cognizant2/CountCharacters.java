package Cognizant2;

import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str =sc.nextLine();
        
        int digit = 0; 
        int aplhabets =0;
        int  whiteSpace = 0; 
        int specialChar = 0;
        
        for(char ch : str.toCharArray()){
            if(Character.isDigit(ch)){
                digit++;
            }
            else if(Character.isWhitespace(ch)){
                whiteSpace++;
            }
            else if(Character.isLetter(ch)){
                aplhabets++;
            }
            else{
                specialChar++;
            }
        }

        System.out.println("Digit count: "+ digit);
        System.out.println("whiteSpace count: "+ whiteSpace);
        System.out.println("aplhabets count: "+ aplhabets);
        System.out.println("specialChar count: "+ specialChar);
    }
}
