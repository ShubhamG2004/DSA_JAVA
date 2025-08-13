import java.util.Scanner;

public class CheckBuzzNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int buzzNum = sc.nextInt();

        boolean isBuzzNum = false;

        if(buzzNum % 10 == 7 || buzzNum % 7 == 0 ){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
