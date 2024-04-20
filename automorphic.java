import java.util.Scanner;

public class automorphic {
    static boolean checkauto(int num){
        int square = num*num;
        while(num>0){
            if(num %10 != square%10){
                return false;
            }
            num /=10;
            square/=10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of test case you want.");
        int t =sc.nextInt();
        for(int i=0;i<t;i++){
            System.out.println("Enter the number:");
            int num =sc.nextInt();

            if(checkauto(num)){
                System.out.println("Automorphic Number");
            }
            else{
                System.out.println("Not Automorphic");
            }
        }
    }
}
