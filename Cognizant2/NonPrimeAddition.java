package Cognizant2;

import java.util.Scanner;

public class NonPrimeAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();

        int sum = 0;
        while(num > 0){
            int rem = num % 10;
            if(!checkPrime(rem)){
                sum += rem;
            }
            num = num /10;
        }
        System.out.println("Sum of Non Prime Number: " + sum);
    }
    static boolean checkPrime(int n){
        if( n <= 1){
            return true;
        }
        if(n == 2) return true;
        if(n % 2 == 0) return false;

        for(int i=2;i< Math.sqrt(n);i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }
}
