package PGP.Week2;

public class FindPeakElement {
    static class Solution {
        public int findPeakElement(int[] nums) {
            int left = 0;
            int right = nums.length - 1;

            while (left < right) {
                int mid = left + (right - left) / 2;

                if (nums[mid] > nums[mid + 1]) {
                    right = mid;
                } else {
                    left = mid + 1; 
                }
            }

            return left; // or right (both same)
        }
        public int findPeakElement2(int[] nums) {
            int n = nums.length;
            int left =0;
            int right = n-1;

            while(left <= right){
                int mid = left + (right - left) / 2;

                boolean isLeftOk = (mid == 0) || (nums[mid-1] < nums[mid]);
                boolean isRightOk = (mid == n-1) || (nums[mid] > nums[mid+1]);

                if(isLeftOk && isRightOk){
                    return mid;
                }

                if(mid >0 && nums[mid] > nums[mid+1]){
                    right = mid-1;
                }
                else{
                    left = mid + 1;
                }
            }

            return left;
        }
    }

}
