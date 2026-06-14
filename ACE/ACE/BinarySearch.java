package ACE;
public class BinarySearch {

    static int BinarySear(int[] arr, int length, int target){
        int left = 0;
        int right = length-1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {11,12,15,27,46,78,97,107};

        int pos = BinarySear(arr, arr.length, 11);

        if(pos == -1){
            System.out.println("Element Not Found");
        }
        else{
            System.out.println("Value found at: " + (pos+1));
        }
    }
}
