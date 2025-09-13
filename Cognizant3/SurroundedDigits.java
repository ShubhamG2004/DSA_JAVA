package Cognizant3;

public class SurroundedDigits {
    public static int countSurroundedNumbers(String S){
        int count = 0;
        int i = 0;
        int N = S.length();
        while(i < N){
            char ch = S.charAt(i);
            if(Character.isDigit(ch)){
                int j = i;

                while( j < N && (Character.isDigit(S.charAt(j)))) j++;

                boolean left = (i-1) >= 0 && (Character.isLetter(S.charAt(i-1)));
                boolean right = j < N && (Character.isLetter(S.charAt(j)));

                if( left && right) count++;

                i = j;
            }
            else{
                i++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countSurroundedNumbers("a123d"));            // 1
        System.out.println(countSurroundedNumbers("123a45b67c"));      // 2
        System.out.println(countSurroundedNumbers("a1b2c3"));          // 3
        System.out.println(countSurroundedNumbers("a12 34b"));         // 0 (space breaks)
        System.out.println(countSurroundedNumbers("x9y!z10q"));
    }
}
