package PGP.Week3;

public class Question28 {
    public int myAtoi(String s) {

        int i = 0;
        int n = s.length();

        // 1. Skip leading spaces
        while(i < n && s.charAt(i) == ' '){
            i++;
        }

        // 2. Handle sign
        int sign = 1;

        if(i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')){

            if(s.charAt(i) == '-'){
                sign = -1;
            }

            i++;
        }

        // 3. Convert digits
        int result = 0;

        while(i < n && Character.isDigit(s.charAt(i))){

            int digit = s.charAt(i) - '0';

            // 4. Handle overflow
            if(result > (Integer.MAX_VALUE - digit) / 10){

                if(sign == 1){
                    return Integer.MAX_VALUE;
                } else {
                    return Integer.MIN_VALUE;
                }
            }

            result = result * 10 + digit;

            i++;
        }

        return result * sign;
    }

}
