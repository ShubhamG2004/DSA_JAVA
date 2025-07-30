public class MinimumSwaptoMakegroup {
    public static void main(String[] args) {
        int[] arr = {0,1,1,1,0,0,1,1,0};
        int swaps = minSwapRequired(arr);
        System.out.println();
        System.out.println("Swaps:: "+swaps);
    }
    static int minSwapRequired(int[] arr){
        int windowSize = 0;

        // Step 1: Counting the Total ones
        for(int i=0;i<arr.length;i++){
            windowSize+=arr[i];
        }

        //Step 2 : count zero in that window
        int curZero = 0;
        for(int i=0;i<windowSize;i++){
            if(arr[i] == 0){
                curZero++;
            }
        }

        int minZeros = curZero;
        int start = 0;
        int end = windowSize-1;
        int n = arr.length;
        
        // Step 3: Slide the window
        while(end < n - 1){
            if(arr[start] == 0){
                curZero --;
            }
            start++;
            end++;
            if(arr[end] == 0){
                curZero++;
            }

            minZeros = Math.min(minZeros, curZero);
        }
        return minZeros;
    }
}
