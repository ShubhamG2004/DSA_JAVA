public class subArraywithLargeSum {
    public static void main(String[] args) {
        int arr[] = {2,-1,4,-5,-6,2,1,10,5,12,-6,9,11};

        int maxSum = arr[0];
        int currSum = arr[0];

        for(int i=0;i<arr.length;i++){
            currSum = Math.max(arr[i], currSum+arr[i]);
            maxSum = Math.max(maxSum, currSum);
        }

        System.out.println("Maximum Sum: " + maxSum);
    }
}
