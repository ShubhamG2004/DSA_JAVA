public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 9, 3, 4, 5, 6, 7, 8, 9};
        System.out.println();
        System.out.println("IsSorted:"+checkArray(arr, 1));
        
    }
    static boolean checkArray(int[] arr, int idx){
        if(idx == arr.length-1){
            return true;
        }

        if(arr[idx] > arr[idx-1]){
            return checkArray(arr, idx + 1);
        } else {
            return false;
        }

    }
}
