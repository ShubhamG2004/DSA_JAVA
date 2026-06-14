public class StringCompression {
    public static void main(String[] args) {
        String str = "aaabbcc";

        String result = "";
        int count = 1;
        for(int i = 0;i<str.length()-1;i++){
            if(str.charAt(i) == str.charAt(i+1)){
                count++;
            }
            else{
                result+=str.charAt(i) + String.valueOf(count);
            }
        }

        result += str.charAt(str.length()-1) + str.valueOf(count);

        System.out.println(result);
    }
}
