public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        int pos = searchNumber(arr, 5);
        System.out.println(pos);
    }

    static int searchNumber(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) { 
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
}
