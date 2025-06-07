import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Foursum_18 {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        if(nums == null || nums.length < 4) {
            return new ArrayList<>();
        }

        ArrayList<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for(int i = 0; i < n - 3; i++) {
            if(i > 0 && nums[i] == nums[i - 1]) continue; // skip duplicates for i
            for(int j = i + 1; j < n - 2; j++) {
                if(j > i + 1 && nums[j] == nums[j - 1]) continue; // skip duplicates for j
                int p = j + 1;
                int q = n - 1;

                while(p < q) {
                    long sum = (long)nums[i] + nums[j] + nums[p] + nums[q];
                    if(sum < target) {
                        p++;
                    }
                    else if(sum > target) {
                        q--;
                    }
                    else {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[p]);
                        temp.add(nums[q]);
                        result.add(temp);
                        // // skip duplicates for p and q
                        // while(p < q && nums[p] == nums[p + 1]) p++;
                        // while(p < q && nums[q] == nums[q - 1]) q--;
                        p++;
                        q--;
                    }
                }
            }
        }

        return result;
    }
    public static void main(String args[]){
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        ArrayList<List<Integer>> res = (ArrayList<List<Integer>>) fourSum(nums, target);
        for(List<Integer> list : res) {
            System.out.println(list);
        }
    }
}
