package BinarySearch;

public class findFloorValue {
    public static void main(String[] args) {
        int[] arr =  {2,3,4,5,6,7,8,9,10};
        int ans = findFloorNum(arr,11);
        System.out.println();
        System.out.println("Ans" + ans);
    }
    static int findFloorNum(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;
        int ans =-1;
        while(left <= right){
            int mid = left + (right - left) /2;
            if(arr[mid] == target){
                ans = arr[mid];
                break;
            }
            else if(arr[mid] < target){
                left = mid+1;
                ans = arr[mid];
            }
            else{
                right = mid-1;
            }
        }
        return ans;
    }
}
