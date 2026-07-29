class Question11 {
    public int longestOnes(int[] nums, int k) {
        int zeros = 0;
        int maxWindow = 0;
        int left =0;

        for(int right=0;right<nums.length;right++){
            if(nums[right] == 0) zeros++;
            
            while(zeros > k){
                if(nums[left] == 0) zeros--;
                left++;
            }

            maxWindow = Math.max(maxWindow, right-left+1);
        }

        return maxWindow;
    }
}