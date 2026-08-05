import java.util.*;

class Question6 {

    public static List<Integer> getMax(List<String> operations) {

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> maxStack = new Stack<>();
        List<Integer> answer = new ArrayList<>();

        for (String op : operations) {

            String[] parts = op.split(" ");
            int type = Integer.parseInt(parts[0]);

            if (type == 1) {

                int value = Integer.parseInt(parts[1]);
                stack.push(value);

                if (maxStack.isEmpty() || value >= maxStack.peek()) {
                    maxStack.push(value);
                }

            } else if (type == 2) {

                int removed = stack.pop();

                if (removed == maxStack.peek()) {
                    maxStack.pop();
                }

            } else {

                answer.add(maxStack.peek());

            }
        }

        return answer;
    }
}