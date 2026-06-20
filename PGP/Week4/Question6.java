package PGP.Week4;

import java.util.ArrayList;
import java.util.List;

public class Question6 {

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

        Question6 obj = new Question6();

        int n = 3;

        List<String> result = obj.generateParenthesis(n);

        System.out.println("Valid Parentheses Combinations:");

        for (String str : result) {
            System.out.println(str);
        }
    }
}