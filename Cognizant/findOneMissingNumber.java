public class findOneMissingNumber {
    public static void main(String[] args) {
        int[] arr =  {1,2,3,4,6,7,8,9};
        int ans = findMissingNum(arr);
        System.out.println("Missing Number is:" + ans);

    }
    static int findMissingNum(int[] arr){
        int max = arr[0];
        int arrSum = 0;
        for(int ele:arr){
            max = Math.max(max,ele);
            arrSum += ele;
        }

        int totalSum = max * (max + 1) / 2;

        int missingNum = totalSum - arrSum;

        return missingNum;
    }
}
