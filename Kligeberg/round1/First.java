package round1;

public class First {
    public static int incCount(int[] nums){
        int n = nums.length;
        int incCount = 1;
        int maxIncCount = Integer.MIN_VALUE;
        for(int i = 1; i < n; i++){
            if(nums[i] > nums[i-1]){
                incCount++;
            }else {
                incCount = 1;
            }
            maxIncCount = Math.max(maxIncCount, incCount);
        }
        return maxIncCount;
    }
    public static int decCount(int[] nums){
        int n = nums.length;
        int decCount = 1;
        int maxDecCount = Integer.MIN_VALUE;
        for(int i = 1; i < n; i++){
            if(nums[i] < nums[i-1]){
                decCount++;
            } else {
                decCount = 1;
            }
            maxDecCount = Math.max(maxDecCount, decCount);
        }
        return maxDecCount;
    }
    public static void main(String[] args) {
        int[] nums = {3, 2, 1};
        int ans = Math.max(incCount(nums), decCount(nums));
        System.out.println(ans);
    }
}
