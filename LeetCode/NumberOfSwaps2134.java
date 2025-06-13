public class NumberOfSwaps2134 {
    public static int countSwaps(int[] nums) {
        int windowSize = 0;
        for(int num:nums){
            windowSize += num;
        }
        
        int curZeros= 0 ;
        for(int i=0;i<windowSize;i++){
            if(nums[i] == 0){
                curZeros++;
            }
        }

        int minZeros = curZeros;
        int start =0;
        int end = windowSize - 1;
        int n =nums.length;

        while(start < n){
            if(start == 0){
                curZeros --;
            }
            start++;
            end++;
            if(end == 0){
                curZeros++;
            }

            minZeros = Math.min(minZeros, curZeros);
        }
        return minZeros;

    }
    public static void main(String[] args) {
        int[] nums = {0,1,1,0,1,1,0,0,1,0,0,1,1,1,0};
        System.out.println("Number of swaps: " + countSwaps(nums));
    }
}
