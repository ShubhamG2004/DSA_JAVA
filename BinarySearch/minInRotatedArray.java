package BinarySearch;

public class minInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {22,24,27,28,29,30,19,20,21};
        int min = minSearch(arr);
        System.out.println();
        System.out.println("Min Element in Array: " + min);
    }
    static int minSearch(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int minValue=Integer.MAX_VALUE;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[start]<=arr[mid]){
                minValue = Math.min(minValue,arr[start]);
                start = mid+1;
            }
            else{
                minValue = Math.min(minValue, arr[mid]);
                end = mid+1;
            }
        }
        return minValue;
    }
}
