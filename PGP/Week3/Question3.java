package PGP.Week3;

public class Question3 {
    int missingNum(int arr[]) {
        // code here
        int n = arr.length + 1;

        long expectedSum = (long)n * (n + 1) / 2;
        long actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        return (int)(expectedSum - actualSum);
    }
}
