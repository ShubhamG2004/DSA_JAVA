package PGP.Week3;

public class Question21 {
    public int maxCircularSum(int arr[]) {
        // code here
        int currMax = 0;
        int maxSum = arr[0];
        
        int currMin = 0;
        int minSum = arr[0];
        
        int totalSum = 0;
        
        for(int num:arr){
            currMax = Math.max(num, num+currMax);
            maxSum = Math.max(maxSum, currMax);
            
            currMin = Math.min(num, num+currMin);
            minSum = Math.min(currMin, minSum);
            
            totalSum += num;
        }
        
        if(maxSum < 0){
            return maxSum;
        }
        
        return Math.max(maxSum, totalSum-minSum);
    }
    
    public static void main(String[] args) {
        Question21 solution = new Question21();

        int[] test1 = {8, -8, 9, -9, 10, -11, 12};
        int[] test2 = {5, -2, 3, 4};
        int[] test3 = {-3, -2, -5, -6};
        int[] test4 = {10};
        int[] test5 = {2, 3, -4};

        System.out.println("Test 1: expected 22, got " + solution.maxCircularSum(test1));
        System.out.println("Test 2: expected 12, got " + solution.maxCircularSum(test2));
        System.out.println("Test 3: expected -2, got " + solution.maxCircularSum(test3));
        System.out.println("Test 4: expected 10, got " + solution.maxCircularSum(test4));
        System.out.println("Test 5: expected 5, got " + solution.maxCircularSum(test5));
    }

}
