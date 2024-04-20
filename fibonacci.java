public class fibonacci {
    public static int fib(int n) {
        return (n == 1 || n==0) ? n : fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args) {
        int n = 6; 
        System.out.println("Fibonacci of " + n + ": " + fib(n));
    }
}
