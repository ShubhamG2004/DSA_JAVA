package BinarySearch;

public class searchInroutatedArray {
    public static void main(String[] args) {
        int arr[] = {7,8,9,10,12,14,18,2,3,5};
        int target = serchTarget(arr, 7);
        System.out.println();
        System.out.println("Ans: " + target);
    }
    static int serchTarget(int[] arr, int target){
        int left = 0;
        int right = arr.length;

        while(left <= right){
            int mid = left + (right - left)/2;
            if(arr[mid] == target){
                return mid;
            }

            // Step 2: Search In the left if Sorted
            if(arr[left] <= arr[mid]){
                if(target >= arr[left]  && target < arr[mid]){
                    right = mid-1;
                }
                else{
                    left = mid+1;
                }
            }
            // Step 3: Search in the Unsorted Array
            else{
                if(target > arr[left]  && target <= arr[mid]){
                    left = mid+1;
                }
                else{
                    right = mid-1;
                }
            }
        }
        return -1;
    }
}
