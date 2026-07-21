class Question5{
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;

        int total = 0;
        for (int num : cardPoints) {
            total += num;
        }

        int windowSize = n - k;
        if (windowSize == 0) {
            return total;
        }

        int windowSum = 0;
        for (int i = 0; i < windowSize; i++) {
            windowSum += cardPoints[i];
        }

        int minWindow = windowSum;

        for (int i = windowSize; i < n; i++) {
            windowSum += cardPoints[i];
            windowSum -= cardPoints[i - windowSize];
            minWindow = Math.min(minWindow, windowSum);
        }

        return total - minWindow;
    }
}