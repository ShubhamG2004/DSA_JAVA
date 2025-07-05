class MergeSort{
    public static void main(String[] args) {
        int arr[] = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Original Array:");
        printArray(arr);
        divide(arr, 0, arr.length - 1);
        System.out.println("Sorted Array:");
        printArray(arr);
    }
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void divide(int arr[], int left, int right) {
       if(left >= right){
         return;
       }
       int mid = left + (right- left)/2;
       divide(arr, mid+1, right);
       divide(arr, left, mid);
       conquer(arr, left, mid, right);
    }
    static void conquer(int[] arr, int left, int mid, int right) {
        int[] merged = new int[right - left + 1];
        int idx1 = left;
        int idx2 = mid + 1;
        int x=0;

        while(idx1 <= mid && idx2 <= right){
            if(arr[idx1] <= arr[idx2]){
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }
        while(idx1 <= mid){
            merged[x++] = arr[idx1++];
        }
        while (idx2 <= right) {
            merged[x++] = arr[idx2++];
        }
        for(int i = 0, j=left; i < merged.length; i++,j++){
            arr[j] = merged[i];
        }

    }
}