package TwoPointer;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        int count = trappedWater(arr);
        System.out.println(count);
    }

    public static int trappedWater(int[] arr){
        int n = arr.length;
        // LeftMax arr
        int[] leftMax= new int[n];
        leftMax[0] = arr[0];
        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(leftMax[i-1], arr[i]);
        }

        // RightMax arr
        int[] rightMax= new int[n];
        rightMax[n-1] = arr[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(rightMax[i+1], arr[i]);
        }

        // Calculate trapped water
        int count = 0;
        for(int i=0;i<n;i++){
            int waterIndex = Math.min(leftMax[i], rightMax[i]) - arr[i];
            if(waterIndex > 0){
                count += waterIndex;
            }
        }

        // Return the total trapped water
        return count;
    }
}
