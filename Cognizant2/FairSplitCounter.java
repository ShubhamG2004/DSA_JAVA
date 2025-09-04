public class FairSplitCounter {
    public static int countFairSplits(int N, int[] A) {
        int totalSum = 0;
        for (int num : A) {
            totalSum += num;
        }

        int fairSplits = 0;
        int leftSum = 0;
        
        for (int i = 0; i < N - 1; i++) {
            leftSum += A[i];
            int rightSum = totalSum - leftSum;
            
            if (Math.abs(leftSum - rightSum) % 2 == 0) {
                fairSplits++;
            }
        }
        return fairSplits;
    }
    public static int countFairSplits2(int[] A) {
        long total = 0;
        for (int x : A) total += x;
        return (total % 2 == 0) ? A.length - 1 : 0;
    }

    public static void main(String[] args) {
        int[] A = {1,2,2,3};
        int result = countFairSplits(A.length, A);
        int result1 = countFairSplits2(A);
        System.out.println();
        System.out.println(result);  
        System.out.println(result1);  
    }
}
