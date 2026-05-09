package PGP.Week3;

public class Question19 {
    public int maxProduct(int[] nums) {
        int prefix = 1;
        int suffix = 1;

        int maxProd = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(prefix == 0) prefix =1;
            if(suffix == 0) suffix =1;
            prefix = prefix * nums[i];
            suffix = suffix * nums[n-i-1];

            maxProd = Math.max(maxProd,Math.max(suffix, prefix));
        }

        return maxProd;
    }

    public static void main(String[] args) {
        Question19 q19 = new Question19();
        int[] nums = {2, 3, -2, 4};
        System.out.println("Maximum product subarray: " + q19.maxProduct(nums));
    }
}
