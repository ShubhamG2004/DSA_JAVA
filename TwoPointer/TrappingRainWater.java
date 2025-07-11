package TwoPointer;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        int count = trappedWater(arr);
        System.out.println(count);
    }

    public static int trappedWater(int[] height) {
        int n = height.length;
        int leftMax = 0;
        int rightMax = 0;
        int leftPos = 0;
        int rightPos = n-1;
        int ans =0;

        while(leftPos < rightPos){
            if(height[leftPos] > leftMax){
                leftMax = Math.max(leftMax, height[leftPos]);
            }
            if(height[rightPos] > rightMax){
                rightMax  = Math.max(rightMax, height[rightPos]);
            }
            if(leftMax < rightMax){
                ans  = ans + leftMax - height[leftPos];
                leftPos++;
            }
            else{
                ans = ans + rightMax - height[rightPos];
                rightPos--; 
            }
        }

        return ans;
    }

}
 