public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 3, 4, 15, 26, 37, 48, 59};
        int target = 26;

        int result = binarySearch(arr, target, 0, arr.length - 1);
        System.out.println("Searching for: " + target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    public static int binarySearch(int[] arr, int target, int low, int high) {
       
        int mid = low + (high - low) /2;
        if(low > high){
            return -1;
        }
        if(target == arr[mid]) {
            return mid;
        }
        else if(target < arr[mid]){
            return binarySearch(arr, target, low, mid-1);
        }
        else {
            return binarySearch(arr, target, mid+1, high);
        }

    }
}
