package BinarySearch;

public class minPageAllocates {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test case 1
        int[] arr1 = {12, 34, 67, 90};
        int k1 = 2;
        int result1 = sol.findPages(arr1, k1);
        System.out.println("Minimum pages (Test Case 1): " + result1);

        // Test case 2
        int[] arr2 = {15, 17, 20};
        int k2 = 5;
        int result2 = sol.findPages(arr2, k2);
        System.out.println("Minimum pages (Test Case 2): " + result2); 
    }
}

class Solution {
    public int findPages(int[] arr, int k) {
        int n = arr.length;
        if (k > n) return -1;

        int start = Integer.MIN_VALUE;
        int end = 0;

        for (int i = 0; i < n; i++) {
            start = Math.max(start, arr[i]);
            end += arr[i];
        }

        int result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (checkAllocation(arr, k, mid)) {
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return result;
    }

    public boolean checkAllocation(int[] arr, int k, int maxPage) {
        int currentStudent = 1;
        int pages = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxPage) return false;

            if (pages + arr[i] > maxPage) {
                currentStudent++;
                pages = arr[i];
            } else {
                pages += arr[i];
            }

            if (currentStudent > k) return false;
        }

        return true;
    }
}
