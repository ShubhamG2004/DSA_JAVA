import java.util.*;

class Question11 {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();

        backtrack(0, candidates, target,
                  new ArrayList<>(), ans);

        return ans;
    }

    private void backtrack(int start,
                           int[] candidates,
                           int target,
                           List<Integer> curr,
                           List<List<Integer>> ans) {

        if (target == 0) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        if (target < 0) {
            return;
        }

        for (int i = start; i < candidates.length; i++) {

            curr.add(candidates[i]);

            backtrack(i,
                      candidates,
                      target - candidates[i],
                      curr,
                      ans);

            curr.remove(curr.size() - 1);
        }
    }

    public static void main(String[] args) {

        Question11 obj = new Question11();

        int[] arr1 = {2,3,6,7};
        System.out.println(obj.combinationSum(arr1, 7));

        int[] arr2 = {2,3,5};
        System.out.println(obj.combinationSum(arr2, 8));

        int[] arr3 = {2};
        System.out.println(obj.combinationSum(arr3, 1));
    }
}