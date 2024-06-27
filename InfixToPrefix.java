import java.util.Stack;

public class InfixToPrefix {
    public static void main(String[] args) {
        String infix = "9-(5+3)*4/6";
        System.out.println("Infix: " + infix);
        System.out.println("Prefix: " + infixToPrefix(infix));
    }

    public static String infixToPrefix(String infix) {
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = infix.length() - 1; i >= 0; i--) {
            char ch = infix.charAt(i);

            if (Character.isDigit(ch)) {
                val.push(ch + "");
            } else if (ch == ')') {
                op.push(ch);
            } else if (ch == '(') {
                while (op.peek() != ')') {
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t = o + v1 + v2;
                    val.push(t);
                }
                op.pop();
            } else {
                while (!op.isEmpty() && precedence(op.peek()) > precedence(ch)) {
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t = o + v1 + v2;
                    val.push(t);
                }
                op.push(ch);
            }
        }

        while (!op.isEmpty()) {
            String v2 = val.pop();
            String v1 = val.pop();
            char o = op.pop();
            String t = o + v1 + v2;
            val.push(t);
        }

        return val.pop();
    }

    public static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case ')':
                return 0; 
            default:
                return -1;
        }
    }
}
