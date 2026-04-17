package String;

public class Atoi {
    // Convert a string to integer with specific rules
    // 1. Skip leading whitespace
    // 2. Check for optional sign (+/-)
    // 3. Read digits until non-digit character
    // 4. Handle overflow (clamp to INT_MIN/INT_MAX)
    public static int myAtoi(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        int idx = 0;
        long result = 0;
        int sign = 1;
        
        // Skip leading whitespace
        while (idx < s.length() && s.charAt(idx) == ' ') {
            idx++;
        }
        
        // Handle sign
        if (idx < s.length() && (s.charAt(idx) == '+' || s.charAt(idx) == '-')) {
            sign = s.charAt(idx) == '-' ? -1 : 1;
            idx++;
        }
        
        // Read digits
        while (idx < s.length() && Character.isDigit(s.charAt(idx))) {
            result = result * 10 + (s.charAt(idx) - '0');
            
            // Handle overflow for positive numbers
            if (sign == 1 && result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            
            // Handle overflow for negative numbers
            if (sign == -1 && -result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            
            idx++;
        }
        
        return (int) (sign * result);
    }
    
    // Alternative approach with better overflow handling
    public static int myAtoi2(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        int idx = 0;
        int sign = 1;
        int result = 0;
        
        // Skip whitespace
        while (idx < s.length() && s.charAt(idx) == ' ') {
            idx++;
        }
        
        // Check sign
        if (idx < s.length() && (s.charAt(idx) == '+' || s.charAt(idx) == '-')) {
            sign = s.charAt(idx) == '-' ? -1 : 1;
            idx++;
        }
        
        // Parse digits with overflow check
        while (idx < s.length() && Character.isDigit(s.charAt(idx))) {
            int digit = s.charAt(idx) - '0';
            
            // Check for overflow before multiplication
            if (result > Integer.MAX_VALUE / 10 || 
                (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            
            result = result * 10 + digit;
            idx++;
        }
        
        return sign * result;
    }
    
    // Test cases
    public static void main(String[] args) {
        System.out.println("Testing Atoi:");
        
        System.out.println(myAtoi("42"));                    // 42
        System.out.println(myAtoi("   -42"));                // -42
        System.out.println(myAtoi("4193 with words"));       // 4193
        System.out.println(myAtoi("words and 987"));         // 0
        System.out.println(myAtoi("-91283472332"));          // -2147483648 (INT_MIN)
        System.out.println(myAtoi("2147483648"));            // 2147483647 (INT_MAX)
        System.out.println(myAtoi("+0 123"));                // 0
        System.out.println(myAtoi(""));                      // 0
        System.out.println(myAtoi("   "));                   // 0
        
        System.out.println("\nTesting myAtoi2:");
        System.out.println(myAtoi2("42"));                   // 42
        System.out.println(myAtoi2("   -42"));               // -42
        System.out.println(myAtoi2("4193 with words"));      // 4193
        System.out.println(myAtoi2("words and 987"));        // 0
    }
}
