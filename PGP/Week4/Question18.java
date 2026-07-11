class Questio18 {
    
    static int count(int N) {
        return solve(N);
    }
    
    static int solve(int n) {
        
        // Base case
        if (n == 0 || n == 2) {
            return 1;
        }
        
        int ways = 0;
        
        for (int i = 0; i <= n - 2; i += 2) {
            
            int left = solve(i);
            int right = solve(n - i - 2);
            
            ways += left * right;
        }
        
        return ways;
    }
}