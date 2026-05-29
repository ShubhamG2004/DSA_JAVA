class Question5{
     public double myPow(double x, int n) {

        long N = n;

        // Handle negative power
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        return power(x, N);
    }

    public double power(double x, long n) {

        // Base case
        if (n == 0)
            return 1;

        double half = power(x, n / 2);

        // Even power
        if (n % 2 == 0) {
            return half * half;
        }

        // Odd power
        return half * half * x;
    }
    
        public static void main(String[] args) {
            Question5 q = new Question5();

            // Basic tests
            System.out.println(q.myPow(2.0, 10));    // expect 1024.0
            System.out.println(q.myPow(2.1, 3));     // expect approx 9.261
            System.out.println(q.myPow(2.0, -2));    // expect 0.25
            System.out.println(q.myPow(2.0, 0));     // expect 1.0

            // Edge case: large negative exponent (Integer.MIN_VALUE)
            System.out.println(q.myPow(2.0, Integer.MIN_VALUE));
        }
        
    }
