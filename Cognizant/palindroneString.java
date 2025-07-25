public class palindroneString {
    public static void main(String[] args) {
        String str = "naman";
        boolean check = palindroneCheck(str);
        System.out.println("Is the string a palindrome?");
        System.out.println(check);
    }
    static boolean palindroneCheck(String str){
        int left =0;
        int right = str.length()-1;

        while( left < right ){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
