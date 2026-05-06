package PGP.Week3;

public class Question10 {
    int minSwap(int[] arr, int k) {
        int n = arr.length;
        int good = 0;
        for(int i=0;i<n;i++){
            if(arr[i] <= k){
                good++;
           
            }
        }
        int bad =0;
        for(int i=0;i<good;i++){
            if(arr[i] > k) bad ++;
        }
        
        int windowStart = 0;
        int windowEnd = good;
        int ans = bad;
        while(windowEnd < n){
            if(arr[windowStart] > k) bad--;
            if(arr[windowEnd] > k) bad++;
            
            ans = Math.min(bad, ans);
            windowStart++;
            windowEnd++;
        }
        
        
        return ans;
        
    }

    public static void main(String[] args) {
        Question10 question = new Question10();
        int[] arr = {2, 8, 7, 6, 5, 4, 7, 6, 5, 4};
        int k = 5;
        System.out.println(question.minSwap(arr, k));
    }
}
