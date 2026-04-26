package PGP.Week2;

public class Question22 {

    public int findPages(int[] arr, int k) {
        int start = 0;
        int end = 0;

        if (arr.length < k) {
            return -1;
        }

        for (int num : arr) {
            start = Math.max(start, num);
            end += num;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isAllocationIsPossible(arr, mid, k)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    public boolean isAllocationIsPossible(int[] arr, int maxPages, int totStudent) {
        int student = 1;
        int pages = 0;

        for (int num : arr) {
            pages += num;

            if (pages > maxPages) {
                pages = num;
                student++;
            }
            if (student > totStudent) {
                return false;
            }
        }

        return true;
    }

    private static void runTest(int[] arr, int k, int expected) {
        Question22 solution = new Question22();
        int output = solution.findPages(arr, k);
        System.out.print("arr=[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("], k=" + k);
        System.out.println("Output:   " + output);
        System.out.println("Expected: " + expected);
        System.out.println("Result:   " + (output == expected ? "PASS" : "FAIL"));
        System.out.println();
    }

    public static void main(String[] args) {
        runTest(new int[] {12, 34, 67, 90}, 2, 113);
        runTest(new int[] {15, 17, 20}, 2, 32);
        runTest(new int[] {10, 20, 30, 40}, 5, -1);
    }
}
