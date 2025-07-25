public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int arr1[] = {2, 4, 6, 8, 10,12};
        int arr2[] = {3, 5, 7, 9, 11};

        int[] ans = mergeArr(arr1, arr2);
        for (int ele : ans) {
            System.out.print(ele + " ");
        }
    }

    static int[] mergeArr(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int ans[] = new int[m + n];

        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                ans[k++] = arr1[i++];
            } else {
                ans[k++] = arr2[j++];
            }
        }

        while (i < n) {
            ans[k++] = arr1[i++];
        }

        while (j < m) {
            ans[k++] = arr2[j++];
        }

        return ans;
    }
}
