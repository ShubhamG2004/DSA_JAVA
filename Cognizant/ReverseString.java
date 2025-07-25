public class ReverseString {
    public static void main(String[] args) {
        String str = "Shubham";
        String reversed = reverseString(str);
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversed);
    }
    public static String reverseString(String str){
        int left =0;
        int right = str.length()-1; 
        char[] strArr = str.toCharArray();

        while(left < right){
            swap(strArr,left, right);
            left++;
            right--;    
        }

        return new String(strArr);
    }
    public static void swap(char[] strArr, int left, int right){
        char temp = strArr[left];
        strArr[left] =strArr[right];
        strArr[right] = temp;
    }
    public static String reverseStringUsingStringBuilder(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
