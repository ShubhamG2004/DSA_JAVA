import java.util.Scanner;

public class FindtheLuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the car no:");
        int num = sc.nextInt();

            // Validate input: must be a 4-digit positive number (1000-9999)
            String numStr = String.valueOf(num);
            if(num < 1000 || num > 9999 || numStr.charAt(0) == '0') {
                System.out.println("Invalid");
            } else {
                int sum = 0;
                int temp = num;
                while(temp > 0) {
                    sum += temp % 10;
                    temp /= 10;
                }
                if(sum % 3 == 0 || sum % 5 == 0 || sum % 7 == 0) {
                    System.out.println("Lucky Number");
                } else {
                    System.out.println("Number is not a valid car number");
                }
            }
            sc.close();
    }
}
