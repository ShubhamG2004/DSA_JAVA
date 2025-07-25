public class missingOneNumber {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,6,7,8};
        int ans = missingNumber(arr);
        System.out.println();
        System.out.println(ans);
    }
    static int missingNumber(int[] arr){
        int max= arr[0];
        int arrSum = 0;
        for(int ele:arr){
            max = Math.max(ele,max);
            arrSum += ele; 
        }

        int totalSum= max*(max+1) / 2;
        int missingNum= totalSum - arrSum;
        
        return missingNum;
    }
}
