import java.util.*;

class Solution {

    public List<String> generateParenthesis(int n) {

        List<String> ans = new ArrayList<>();

        solve(ans, new StringBuilder(), 0, 0, n);

        return ans;
    }

    private void solve(List<String> ans,
                       StringBuilder curr,
                       int open,
                       int close,
                       int n) {

        // Base Case
        if (open == n && close == n) {
            ans.add(curr.toString());
            return;
        }

        // Add '('
        if (open < n) {
            curr.append('(');
            solve(ans, curr, open + 1, close, n);
            curr.deleteCharAt(curr.length() - 1); // Backtrack
        }

        // Add ')'
        if (close < open) {
            curr.append(')');
            solve(ans, curr, open, close + 1, n);
            curr.deleteCharAt(curr.length() - 1); // Backtrack
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        // Test Case 1
        int n1 = 1;
        System.out.println("n = " + n1);
        System.out.println(obj.generateParenthesis(n1));
        System.out.println();

        // Test Case 2
        int n2 = 2;
        System.out.println("n = " + n2);
        System.out.println(obj.generateParenthesis(n2));
        System.out.println();

        // Test Case 3
        int n3 = 3;
        System.out.println("n = " + n3);
        System.out.println(obj.generateParenthesis(n3));
        System.out.println();

        // Test Case 4
        int n4 = 4;
        System.out.println("n = " + n4);
        System.out.println(obj.generateParenthesis(n4));
        System.out.println();

        // Test Case 5
        int n5 = 5;
        System.out.println("n = " + n5);
        System.out.println(obj.generateParenthesis(n5));
    }
}