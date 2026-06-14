public class FindLargestString {
    public static void main(String[] args) {
        String str = " I Love Java Programming but i love Java Program!";

        String strArr[] = str.split(" ");

        int maxLen = 0;
        String res = "";
        for(String s: strArr){
            if(s.length() > maxLen){
                maxLen= s.length();
                res = s;
            }
        }

        System.out.println("Max Length: " + maxLen + " Max String: "+res);
    }
}
