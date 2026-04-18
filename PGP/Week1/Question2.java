public class Question2 {
    static boolean isPrime(int n) {
        // code here
        if(n == 1 || n==2){
            return false;
        }
        boolean isPrime = true;
        for(int i=2;i<n/2;i++){
            if(n % i == 0){
                isPrime = false;
            }
        }
        
        return isPrime;
    }
    public static void main(String[] args) {
        
    }
}
