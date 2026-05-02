package PGP.Week3;

public class Question2 {
    public static int findEquilibrium(int arr[]) {
        int totalSum = 0;
        
        for (int num : arr) {
            totalSum += num;
        }
        
        int leftSum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i]; // now totalSum = rightSum
            
            if (leftSum == totalSum) {
                return i;
            }
            
            leftSum += arr[i];
        }
        
        return -1;
    }
}
