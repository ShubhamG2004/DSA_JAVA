package PGP.Week3;

import java.util.ArrayList;
import java.util.List;

public class Question18 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            int idx = Math.abs(nums[i]) - 1;

            if(nums[idx] < 0){
                ans.add(Math.abs(nums[i]));
            }
            else{
                nums[idx] = -nums[idx];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Question18 q18 = new Question18();
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println("Duplicates: " + q18.findDuplicates(nums));
    }
}
