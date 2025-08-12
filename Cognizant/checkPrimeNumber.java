import java.util.Scanner;

public class checkPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int num = sc.nextInt();

        if(num <= 1){
            System.out.println("Not a Prime Number!!");
        }
        else{
            boolean isPrime = true;

            for(int i=2;i<Math.sqrt(num);i++){
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
                System.out.println("Prime Number");
            else{
                System.out.println("Not a Prime Number");
            }
        }
    }
}
