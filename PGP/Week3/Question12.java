package PGP.Week3;
// formula ->
public class Question12 {
    public int subarraySum(int[] arr) {
        // code here
        int sum = 0;
        int n = arr.length;
        for(int i=0;i<arr.length;i++){
            int contribute = arr[i] * (i+1) * (n-i);
            sum+=contribute;
        }
        
        return sum;
    }

    public static void main(String[] args) {
        Question12 q = new Question12();
        
        // Test case 1: Array with positive numbers
        int[] arr1 = {1, 2, 3};
        System.out.println("Test case 1: [1, 2, 3]");
        System.out.println("Result: " + q.subarraySum(arr1));
        System.out.println("Expected: 20");
        System.out.println();
        
        // Test case 2: Single element
        int[] arr2 = {5};
        System.out.println("Test case 2: [5]");
        System.out.println("Result: " + q.subarraySum(arr2));
        System.out.println("Expected: 5");
        System.out.println();
        
        // Test case 3: Two elements
        int[] arr3 = {1, 2};
        System.out.println("Test case 3: [1, 2]");
        System.out.println("Result: " + q.subarraySum(arr3));
        System.out.println("Expected: 6");
        System.out.println();
        
        // Test case 4: Array with zeros
        int[] arr4 = {0, 1, 2};
        System.out.println("Test case 4: [0, 1, 2]");
        System.out.println("Result: " + q.subarraySum(arr4));
        System.out.println("Expected: 10");
        System.out.println();
        
        // Test case 5: Larger array
        int[] arr5 = {1, 2, 3, 4};
        System.out.println("Test case 5: [1, 2, 3, 4]");
        System.out.println("Result: " + q.subarraySum(arr5));
        System.out.println();
    }
}