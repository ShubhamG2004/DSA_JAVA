import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number:");
        int num = sc.nextInt();
        System.out.println("Original Number: "+num);

        if(num < 0){
            System.out.println("Invalid Number");
        }else{
            int original = num;
            int revered = 0;

            while(num > 0){
                int digit = num %10;
                revered = revered*10 + digit;
                num/=10;
            }

            if(original == revered){
                System.out.println("Palindrone Number");
            }else{
                System.out.println("Not a Palindrone Number");
            }
        }

    }
}
