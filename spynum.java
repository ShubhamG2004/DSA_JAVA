import java.util.Scanner;

public class spynum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++){
            int num = sc.nextInt();
            int k, sum=0,mul=1;

            while(num > 0){
                int rem = num % 10;
                sum +=rem;
                mul*=rem;
                num=num/10;
            }
            System.out.println(sum);
            System.out.println(mul);

            if(sum == mul){
                System.out.println("Spy Number");
            }
            else{
                System.out.println("Not Spy");
            }

        }
    }
}
