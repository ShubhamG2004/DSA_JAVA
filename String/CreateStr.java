package String;

public class CreateStr {
    static void printChar(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    static int findLength(String str){
        int len=0;

        for(int i=0; i<str.length(); i++){
            len++;
        }

        return len;
    }
    static boolean palindrome(String str){
        int i=0, j=str.length()-1;
        while(i<j){
            if((str.charAt(i)) != (str.charAt(j))){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
    public static void main(String[] args) {
        String str = "Hello World!";
        System.out.println(str);
        int len = findLength(str);
        System.out.println(len);
        printChar(str);
        System.out.println();

        System.out.println("palindrome 'madam'::" + palindrome("madam"));
        System.out.println("palindrome 'Shubham' ::" + palindrome("Shubham"));
    }
}
