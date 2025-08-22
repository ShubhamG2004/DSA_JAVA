package Cognizant2;

import java.util.Scanner;

public class VirusUserID{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Find the Nth Tribonacci Number:");

        int n = sc.nextInt();

        System.out.println("Nth number:: "+ findVirusById(n));
    }
    public static int findVirusById(int n){
        int a =0;
        int b= 0;
        int c =1;
        int d =0 ;

        if(n == 0){
            return 0;
        }
        else if(n == a || n == b || n==c){
            return n;
        }
        else{

            for(int i=4;i<=n;i++){
                d = a + b+c;
                a =b;
                b =c;
                c=d;
            }
        }

        return c;
    }
}