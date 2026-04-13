import java.util.Stack;

public class infix {
    public static void main(String[] args) {
        String str = "9-5+3*4/6";
        System.out.println(evaluateInfix(str));
    }

    public static int evaluateInfix(String str) {
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                // If the character is a digit, convert it to an integer
                val.push(ch - '0');
            } else if (ch == '(') {
                op.push(ch);
            } else if (ch == ')') {
                while (op.peek() != '(') {
                    val.push(applyOp(op.pop(), val.pop(), val.pop()));
                }
                op.pop();
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (!op.isEmpty() && hasPrecedence(ch, op.peek())) {
                    val.push(applyOp(op.pop(), val.pop(), val.pop()));
                }
                op.push(ch);
            }
        }

        while (!op.isEmpty()) {
            val.push(applyOp(op.pop(), val.pop(), val.pop()));
        }

        return val.pop();
    }

    public static boolean hasPrecedence(char op1, char op2) {
        if (op2 == '(' || op2 == ')') {
            return false;
        }
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) {
            return false;
        }
        return true;
    }

    public static int applyOp(char op, int b, int a) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    throw new UnsupportedOperationException("Cannot divide by zero");
                }
                return a / b;
        }
        return 0;
    }
}
