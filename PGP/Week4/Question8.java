import java.util.*;

class Question8 {

    public List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> ans = new ArrayList<>();

        backtrack(1, n, k, new ArrayList<>(), ans);

        return ans;
    }

    private void backtrack(int start, int n, int k,
                           List<Integer> curr,
                           List<List<Integer>> ans) {

        if (curr.size() == k) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        for (int i = start; i <= n; i++) {

            curr.add(i);

            backtrack(i + 1, n, k, curr, ans);

            curr.remove(curr.size() - 1);
        }
    }

    public static void main(String[] args) {

        Question8 obj = new Question8();

        // Test Case 1
        int n1 = 4, k1 = 2;
        System.out.println("n = " + n1 + ", k = " + k1);
        System.out.println(obj.combine(n1, k1));
        System.out.println();

        // Test Case 2
        int n2 = 1, k2 = 1;
        System.out.println("n = " + n2 + ", k = " + k2);
        System.out.println(obj.combine(n2, k2));
        System.out.println();

        // Test Case 3
        int n3 = 5, k3 = 3;
        System.out.println("n = " + n3 + ", k = " + k3);
        System.out.println(obj.combine(n3, k3));
        System.out.println();

        // Test Case 4
        int n4 = 6, k4 = 4;
        System.out.println("n = " + n4 + ", k = " + k4);
        System.out.println(obj.combine(n4, k4));
        System.out.println();

        // Test Case 5
        int n5 = 3, k5 = 2;
        System.out.println("n = " + n5 + ", k = " + k5);
        System.out.println(obj.combine(n5, k5));
    }
}