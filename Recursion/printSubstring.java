public class printSubstring {
    public static void main(String[] args) {
        String str = "abc";
        printSubstrings(str, 0, "");
    }
    static void printSubstrings(String str, int idx, String curr){
        if(idx == str.length()){
            System.out.println(curr);
            return;
        }
        char currChar = str.charAt(idx);
        printSubstrings(str, idx+1, curr + currChar);
        printSubstrings(str, idx+1, curr);
    }
}