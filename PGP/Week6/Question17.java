class Solution {

    public int maxTaskAssign(int[] tasks, int[] workers, int pills, int strength) {

        Arrays.sort(tasks);
        Arrays.sort(workers);

        int low = 0;
        int high = Math.min(tasks.length, workers.length);

        while (low < high) {

            int mid = (low + high + 1) / 2;

            if (canAssign(tasks, workers, pills, strength, mid))
                low = mid;
            else
                high = mid - 1;
        }

        return low;
    }

    private boolean canAssign(int[] tasks, int[] workers,
                              int pills, int strength, int k) {

        Deque<Integer> dq = new ArrayDeque<>();

        int j = workers.length - 1;

        for (int i = k - 1; i >= 0; i--) {

            while (j >= workers.length - k &&
                   workers[j] + strength >= tasks[i]) {

                dq.offerFirst(workers[j]);
                j--;
            }

            if (dq.isEmpty())
                return false;

            if (dq.peekLast() >= tasks[i]) {

                // strongest worker without pill
                dq.pollLast();

            } else {

                if (pills == 0)
                    return false;

                pills--;

                // weakest worker with pill
                dq.pollFirst();
            }
        }

        return true;
    }
}