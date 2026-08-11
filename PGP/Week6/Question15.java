class Solution {
    public int shortestSubarray(int[] nums, int k) {

        int n = nums.length;

        long[] prefix = new long[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        Deque<Integer> dq = new ArrayDeque<>();

        int ans = n + 1;

        for (int i = 0; i <= n; i++) {

            while (!dq.isEmpty() &&
                   prefix[i] - prefix[dq.peekFirst()] >= k) {

                ans = Math.min(ans, i - dq.pollFirst());
            }

            while (!dq.isEmpty() &&
                   prefix[dq.peekLast()] >= prefix[i]) {

                dq.pollLast();
            }

            dq.offerLast(i);
        }

        return ans == n + 1 ? -1 : ans;
    }
}