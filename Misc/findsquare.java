public class findsquare {
    static int sqrt(int[] a, int num) {
        int st = 0, ed = num;
        int ans = -1; 
        while (st <= ed) {
            int mid = st + (ed - st) / 2;
            int val = mid * mid;
            if (val == num) {
                return mid;
            } else if (val < num) {
                ans = mid; 
                st = mid + 1;
            } else {
                ed = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] a={2,4,6,8,10,14,16,19,23,24,26,27,31,33};
        int num=24;
        System.out.println(sqrt(a,num));
    }
}
