import java.util.Scanner;

public class RevereNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        System.out.print("Enter a number: ");
        int N = sc.nextInt();
        System.out.print("Reversed number: ");
        reverseNumber(N);
    }
    static void reverseNumber(int num) {
        if(num == 0){
            return;
        }

        System.out.print(num % 10);
        reverseNumber(num / 10);
    }
}
