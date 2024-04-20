import java.util.Scanner;

public class Isbn {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            long num = sc.nextLong();
            int digit=0,sum=0,m=1;
            long retrore=num;

            while(num >0){
                digit ++;
                num/=10;
            }

            if(digit==10){
                num =retrore;
                while(num>0){
                    long rem =num%10;
                    sum += (m*rem);
                    m++;
                    num/=10;
                    System.out.print(sum + " ");
                }
                if(sum % 11 == 0){
                    System.out.println("Isbm");
                }
                else{
                    System.out.println("Not");
                }
            }

            
        }
    }
}
