public class Question2 {
    public int fib(int n) {
        if(n ==0) return 0;
        if(n ==1) return 1;

        return fib(n-1) + fib(n-2);
    }
    
    public static void main(String[] args) {
        Question2 q = new Question2();
        int n = 10;
        System.out.println("Fibonacci sequence up to " + n + ":");
        for (int i = 0; i <= n; i++) {
            System.out.println(i + " -> " + q.fib(i));
        }
    }
} 