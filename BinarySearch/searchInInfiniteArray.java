package BinarySearch;

public class searchInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,6,7,9,10,12,14,15,17,19,20};
    
        int[] range = findRangeBetweenArr(arr, 10);
        System.out.println("Start from: " +range[0] + " end:" +range[1]);
        System.out.println();
        
        int ans = binarySearch(arr, range[0], range[1], 10);
        System.out.println("Ans:: "+ans);
    }
    static int[] findRangeBetweenArr(int[] arr, int target){
        int start =0;
        int end = 1;

        while(end < arr.length && arr[end] <= target ){
            start = end;
            end = 2 *end;
        }

        int range[] =new int[2];
        range[0] = start;
        range[1] = end;

        return range;
    }
    static int binarySearch(int arr[], int start, int end, int target){
        int ans =-1;
        while(start <= end){
            int mid = start + (end -start)/2;
            if(arr[mid] == target){
                ans = mid;
                break;
            }
            else if(arr[mid] < target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }

        return ans;
    }
}
