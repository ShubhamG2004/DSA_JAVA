import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(str);
        int left = 0;
        int right = str.length()-1;
        boolean flag = true;
        while(left <= right){
            if(str.charAt(left) != str.charAt(right)){
                flag = false;
            }

            left++;
            right--;
        }
        
        if(flag) System.out.println("Palindrome");
        else System.out.println("not Palindrome");
    }
}
