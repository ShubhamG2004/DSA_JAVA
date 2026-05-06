package PGP.Week3;

public class Question11 {
    public void swap(int arr[], int start, int end){
        while(start <= end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int l = 0;

        swap(nums,l,n-1);
        swap(nums,l,k-1);
        swap(nums,k,n-1);
    }

    public static void main(String[] args) {
        Question11 question = new Question11();
        
        // Test case 1
        int[] arr1 = {1, 2, 3, 4, 5};
        question.rotate(arr1, 2);
        System.out.print("Test 1 - rotate [1,2,3,4,5] by 2: ");
        for(int num : arr1) System.out.print(num + " ");
        System.out.println();
        
        // Test case 2
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
        question.rotate(arr2, 3);
        System.out.print("Test 2 - rotate [1,2,3,4,5,6,7] by 3: ");
        for(int num : arr2) System.out.print(num + " ");
        System.out.println();
        
        // Test case 3
        int[] arr3 = {1, 2, 3};
        question.rotate(arr3, 0);
        System.out.print("Test 3 - rotate [1,2,3] by 0: ");
        for(int num : arr3) System.out.print(num + " ");
        System.out.println();
    }
}
