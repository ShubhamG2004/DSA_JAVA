class Question8 {
    public int numberOfSubarrays(int[] nums, int k) {
        int oddNum =0;
        int ans =0;
        int left =0;
        for(int right = 0;right<nums.length;right++){
            if(nums[right] % 2 != 0){
                oddNum++;
            }
            if(oddNum==k){
                while(left <= right && oddNum == k){
                    if(oddNum==k){
                        ans++;
                    }
                    if(nums[left] % 2 != 0){
                        oddNum--;
                    }
                    if(oddNum < k){
                        break;
                    }
                    left++;
                }
            }
        }

        return ans;
    }
}