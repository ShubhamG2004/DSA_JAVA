import java.util.Scanner;

public class sumDigit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the Digits");
        int num=sc.nextInt();
        int sumofDigit =0;
        int i=0;
        while(num>0)
        {
            sumofDigit+=num%10;
            num=num/10;
            i++;
        }
        System.out.println(sumofDigit);
    }
}
