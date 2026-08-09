import java.util.*;

public class Question9 {

    static int largestRectangle(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        for (int i = 0; i <= n; i++) {

            int currHeight = (i == n) ? 0 : heights[i];

            while (!stack.isEmpty() && heights[stack.peek()] >= currHeight) {

                int height = heights[stack.pop()];

                int width;
                if (stack.isEmpty()) {
                    width = i;
                } else {
                    width = i - stack.peek() - 1;
                }

                maxArea = Math.max(maxArea, height * width);
            }

            stack.push(i);
        }

        return maxArea;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[] heights = new int[cols];
        int answer = 0;

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                int val = sc.nextInt();

                if (val == 1)
                    heights[j]++;
                else
                    heights[j] = 0;
            }

            answer = Math.max(answer, largestRectangle(heights));
        }

        System.out.println(answer);
    }
}