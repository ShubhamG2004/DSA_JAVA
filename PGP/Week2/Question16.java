package PGP.Week2;

public class Question16 {

    static int inversionCount(int[] arr) {
        return mergeSort(arr, 0, arr.length - 1);
    }

    static int mergeSort(int[] arr, int left, int right) {
        int count = 0;

        if (left < right) {
            int mid = left + (right - left) / 2;

            count += mergeSort(arr, left, mid);
            count += mergeSort(arr, mid + 1, right);
            count += merge(arr, left, mid, right);
        }

        return count;
    }

    static int merge(int[] arr, int left, int mid, int right) {
        int i = left, j = mid + 1, k = 0;
        int count = 0;

        int[] temp = new int[right - left + 1];

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                count += (mid - i + 1);
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (i = left, k = 0; i <= right; i++, k++) {
            arr[i] = temp[k];
        }

        return count;
    }

    private static void runTest(int[] arr, int expected) {
        int[] input = arr.clone();
        int result = inversionCount(input);
        System.out.println("result=" + result + ", expected=" + expected
                + (result == expected ? " [PASS]" : " [FAIL]"));
    }

    public static void main(String[] args) {
        runTest(new int[] {2, 4, 1, 3, 5}, 3);
        runTest(new int[] {5, 4, 3, 2, 1}, 10);
    }
}