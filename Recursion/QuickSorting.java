public class QuickSorting {
    public static void main(String[] args) {
        int arr[] = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Original Array:");
        printArray(arr);
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array:");
        printArray(arr);
    }
    static void quickSort(int arr[], int low, int high){
        if( low >= high){
            return;
        }
        int pivotIndex = partition(arr, low, high);
        quickSort(arr, low, pivotIndex - 1);
        quickSort(arr, pivotIndex+1, high); 

    }
    static int partition(int arr[], int low, int high) {
        
        int pivot = arr[low];
        int cnt =0;
        for(int i=low+1;i<=high;i++){
            if(arr[i] <=pivot){
                cnt++;
            }
        }
        int pivotIndex = low + cnt;
        swap(arr, low, pivotIndex);

        int i= low, j=high;
        while(i < pivotIndex && j > pivotIndex){
            while(arr[i] <= pivot) i++;
            while(arr[j] > pivot) j--;

            if(i < pivotIndex && j> pivotIndex){
                swap(arr, i, j);
            }
        }
        return pivotIndex;
    }
    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
