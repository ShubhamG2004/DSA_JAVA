package PGP.Week2;

import java.util.Arrays;

class Question12 {
    public int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        int n = stalls.length;
        int left = 1;
        int right = stalls[n - 1];

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (isPlacingRight(stalls, k, mid)) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return right;
    }

    public boolean isPlacingRight(int stalls[], int reqCow, int giveCow) {
        int prevCow = stalls[0];
        reqCow--;

        for (int i = 1; i < stalls.length; i++) {
            if ((stalls[i] - prevCow) >= giveCow) {
                prevCow = stalls[i];
                reqCow--;
            }
            if (reqCow == 0) {
                return true;
            }
        }

        return false;
    }
}
