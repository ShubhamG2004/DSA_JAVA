package BinarySearch;

public class minDifference{
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,9,10,13,15,17,19,21,24,27,30,31};
        int res = minDifferenceFind(arr, 23);
        System.out.println();
        System.out.println(res);
    }
    static int minDifferenceFind(int[] arr, int target){
        int left =0;
        int right = arr.length;

        int ans =-1;

        while(left <= right){
            int mid = left + (right-left)/2;
            if(arr[mid] == target){
                ans = arr[mid];
                break;
            }
            else if(arr[mid] < target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }

        int res = 0;
        if(ans  == -1){
            if(right == -1){
                res = Math.abs(target - arr[left]);
            }
            else if(left == arr.length){
                res = Math.abs(target - arr[right]);
            }
            else{
                int ans1 = Math.abs(target - arr[left]);
                int ans2 = Math.abs(target - arr[right]);
                res = Math.min(ans1, ans2);
            }
        }

        return res;
    }
}