package BinarySearch;

public class countTotalOcuurence {
    public static void main(String[] args) {
        int[] arr = {2,3,4,4,4,4,5,6,7,8};

        int firstOcc = binarySearch(arr,4,true);
        int lastOcc = binarySearch(arr,4, false);

        System.out.println();
        System.out.println("First Occurence:"+ (firstOcc+1));
        System.out.println("Last Occurence:"+ (lastOcc+1));

        int res = lastOcc - firstOcc +1;
        System.out.println("Total Ocuurence of 4 Is:"+res);
    }
    static int binarySearch(int[] arr, int target, boolean isFirst){
        int left = 0;
        int right = arr.length-1;
        int ans =-1;
        while(left <= right){
            int mid = left + (right - left) /2;
            if(arr[mid] == target){
                ans = mid;
                if(isFirst){
                    right = mid-1;
                }
                else{
                    left = mid+1;
                }
            }

            else if(arr[mid] < target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return ans;
    }
}
