class Question2 {

    int countPairs(int arr[], int target) {
        // Complete the function
        int res = 0;
        int n = arr.length;
        int left = 0, right = n - 1;

        while (left < right) {
          
            if (arr[left] + arr[right] < target)
                left++;

            else if (arr[left] + arr[right] > target)
                right--;

            else {
                int cnt1 = 0, cnt2 = 0;
                int ele1 = arr[left], ele2 = arr[right];
              
                while (left <= right && arr[left] == ele1) {
                    left++;
                    cnt1++;
                }
              
                while (left <= right && arr[right] == ele2) {
                    right--;
                    cnt2++;
                }
               
                if (ele1 == ele2) 
                    res += (cnt1 * (cnt1 - 1)) / 2;
              
                else 
                    res += (cnt1 * cnt2);
            }
        }
        return res;
    }
    public static void main(String[] args) { 
        int[] arr = {-1, 1, 5, 5, 7}; 
        int target = 6;
        ​System.out.println(countPairs(arr, target)); 
    }
}
