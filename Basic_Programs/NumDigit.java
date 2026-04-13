import java.util.Scanner;

public class NumDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Digits:");
        int n = sc.nextInt();

        // Display the entered digits
        System.out.println("You entered: " + n);

        int i=0;

        while(n > 0){
            n=n/10;
            i++;
        }
        System.out.println(i);
    }
}
