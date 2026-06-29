import java.util.ArrayList;
import java.util.List;

public class Question12 {
    public void backtrack(int[] nums, List<Integer> curr, List<List<Integer>> ans){
        if(curr.size()==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(curr.contains(nums[i]))continue;
            curr.add(nums[i]);
            backtrack(nums, curr, ans);
            curr.remove(curr.size()-1);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans =new ArrayList<>();
        List<Integer> curr =new ArrayList<>();
        backtrack(nums,curr,ans);
        return ans;

    }
    public static void main(String[] args) {
        
    }
}
