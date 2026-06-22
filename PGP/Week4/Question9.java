import java.util.*;

class Question9 {

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(1, ans, new ArrayList<>(), k, n, 0);
        return ans;
    }

    public void backtrack(int start, List<List<Integer>> ans,
                          List<Integer> curr, int k,
                          int tar, int sum) {

        if (curr.size() == k) {
            if (sum == tar) {
                ans.add(new ArrayList<>(curr));
            }
            return;
        }

        for (int i = start; i <= 9; i++) {
            sum += i;
            curr.add(i);

            backtrack(i + 1, ans, curr, k, tar, sum);

            sum -= i;
            curr.remove(curr.size() - 1);
        }
    }

    public static void main(String[] args) {

        Question9 obj = new Question9();

        // Test Case 1
        int k1 = 3, n1 = 7;
        System.out.println("k = " + k1 + ", n = " + n1);
        System.out.println(obj.combinationSum3(k1, n1));
        System.out.println();

        // Test Case 2
        int k2 = 3, n2 = 9;
        System.out.println("k = " + k2 + ", n = " + n2);
        System.out.println(obj.combinationSum3(k2, n2));
        System.out.println();

        // Test Case 3
        int k3 = 4, n3 = 1;
        System.out.println("k = " + k3 + ", n = " + n3);
        System.out.println(obj.combinationSum3(k3, n3));
        System.out.println();

        // Test Case 4
        int k4 = 3, n4 = 15;
        System.out.println("k = " + k4 + ", n = " + n4);
        System.out.println(obj.combinationSum3(k4, n4));
        System.out.println();

        // Test Case 5
        int k5 = 2, n5 = 5;
        System.out.println("k = " + k5 + ", n = " + n5);
        System.out.println(obj.combinationSum3(k5, n5));
    }
}