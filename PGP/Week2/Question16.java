package PGP.Week2;

public class Question16 {
    static int  count = 0;

    static int inversionCount(int[] arr) {
        count = 0;
        mergeSort(arr, 0, arr.length - 1);
        return count;
    }

    static void  mergeSort(int[] arr, int left, int right) {
        if( left >= right) return;
        int mid = left + (right - left) / 2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    static void merge(int[] arr, int l, int mid, int r) {

        int n1 = mid - l + 1;
        int n2 = r - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        int i, j, k;

        for (i = 0; i < n1; i++)
            left[i] = arr[l + i];

        for (j = 0; j < n2; j++)
            right[j] = arr[mid + 1 + j];

        i = 0;
        j = 0;
        k = l;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j])
                arr[k++] = left[i++];
            else{
                arr[k++] = right[j++];
                count += (n1 - i);
            }
        }

        while (i < n1)
            arr[k++] = left[i++];

        while (j < n2)
            arr[k++] = right[j++];
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