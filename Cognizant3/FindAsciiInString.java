package Cognizant3;

import java.util.HashSet;

public class FindAsciiInString {
    public int findAscii(int input1, int[] input2, String input3){
        HashSet<Integer> digitSet = new HashSet<>();
        for(int num:input2){
            if(!digitSet.contains(num)){
                digitSet.add(num);
            }
        }

        int count =0;

        for(char ch : input3.toCharArray()){
            int ascii = (int)ch;
            boolean matched = false;

            while(ascii > 0){
                int digit = ascii %10;
                if(digitSet.contains(digit)){
                    matched = true;
                    break;
                }
                ascii /= 10;
            }

            if(matched){
                count++;
            }

        }

        return count;
        
    }
    public static void main(String[] args) {
        FindAsciiInString finder = new FindAsciiInString();
        int[] input2 = {1, 2, 3,4,5};
        String input3 = "BGHIJ";
        int result = finder.findAscii(0, input2, input3);
        System.out.println("Count: " + result);
    }
}
