public class MakeEqualArray1460 {
    public static boolean canMakeEqual(int[] arr1, int[] arr2) {
        int[] freq = new int[1001]; 

        // storing into the frequency array
        for(int num: arr1){
            freq[num]++;
        }

        for(int num : arr2){
            freq[num]--;
        }

        for(int count:freq){
            if(count != 0){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {2, 3, 1};
        System.out.println(canMakeEqual(arr1, arr2)); // Output: true

        int[] arr3 = {1, 2, 3};
        int[] arr4 = {2, 3, 4};
        System.out.println(canMakeEqual(arr3, arr4)); // Output: false
    }
}
