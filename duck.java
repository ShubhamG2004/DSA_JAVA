import java.util.Scanner;

public class duck {
    static boolean checknum(int num){
        while(num > 0){
            if(num %10==0){
                return true;
            }
            num/=10;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t =sc.nextInt();

        for(int i=0;i<t;i++){
            int num =sc.nextInt();
            if(checknum(num)){
                System.out.println("Duck");
            }
            else{
                System.out.println("Not Duck!!");
            }
        }
    }
}
