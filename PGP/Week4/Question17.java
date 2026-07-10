import java.io.*;
import java.util.*;

public class Question17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        generateParenthesis(
            n, m,
            0, 0,
            0, 0,
            new StringBuilder(),
            new Stack<Character>()
        );
    }

    static void generateParenthesis(
        int n,
        int m,
        int openRound,
        int closeRound,
        int openCurly,
        int closeCurly,
        StringBuilder current,
        Stack<Character> stack
    ) {

        // Base case
        if (openRound == n &&
            closeRound == n &&
            openCurly == m &&
            closeCurly == m) {

            System.out.println(current.toString());
            return;
        }

        // Add '('
        if (openRound < n) {

            current.append('(');
            stack.push('(');

            generateParenthesis(
                n, m,
                openRound + 1, closeRound,
                openCurly, closeCurly,
                current, stack
            );

            // Backtrack
            current.deleteCharAt(current.length() - 1);
            stack.pop();
        }

        // Add '{'
        if (openCurly < m) {

            current.append('{');
            stack.push('{');

            generateParenthesis(
                n, m,
                openRound, closeRound,
                openCurly + 1, closeCurly,
                current, stack
            );

            // Backtrack
            current.deleteCharAt(current.length() - 1);
            stack.pop();
        }

        // Add ')'
        if (closeRound < openRound &&
            !stack.isEmpty() &&
            stack.peek() == '(') {

            current.append(')');
            stack.pop();

            generateParenthesis(
                n, m,
                openRound, closeRound + 1,
                openCurly, closeCurly,
                current, stack
            );

            // Backtrack
            current.deleteCharAt(current.length() - 1);
            stack.push('(');
        }

        // Add '}'
        if (closeCurly < openCurly &&
            !stack.isEmpty() &&
            stack.peek() == '{') {

            current.append('}');
            stack.pop();

            generateParenthesis(
                n, m,
                openRound, closeRound,
                openCurly, closeCurly + 1,
                current, stack
            );

            // Backtrack
            current.deleteCharAt(current.length() - 1);
            stack.push('{');
        }
    }
}