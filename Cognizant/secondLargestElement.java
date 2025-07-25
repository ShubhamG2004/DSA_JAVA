public class secondLargestElement {
    public static void main(String[] args) {
        int[] arr = {7,8,3,5,12,56,87};
        int sec=secondLarge(arr);
        System.out.println();
        System.out.println("Second Large:");
        System.out.println(sec);
    }
    public static int secondLarge(int[] arr){
        int firstMax  = Integer.MIN_VALUE;
        int secLarge = Integer.MIN_VALUE;

        for (int ele : arr) {
            if (ele > firstMax) {
                secLarge = firstMax;
                firstMax = ele;
            } else if (ele > secLarge && ele < firstMax) {
                secLarge = ele;
            }
        }
        System.out.println(firstMax);
        return secLarge;
    }
}
