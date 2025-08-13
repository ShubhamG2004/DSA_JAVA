import java.util.Scanner;

public class primeNumberInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        if(start < end || start < 0 || end < 0 || (end -start ) >= 0){
            System.out.println("Provide valid input");
        }

        int num = start;

        while(num < end){
            boolean isPrime = true;

            if(num < 2){
                isPrime = false;
            }
            else{
                for(int i = 2;i < Math.sqrt(num);i++){
                    if(num % i == 0){
                        isPrime = false;
                        break;
                    }
                }
            }

            if(isPrime){
                System.out.println(num + " ");
            }
            num++;
        }
    }
}
