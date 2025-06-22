import java.util.HashSet;

public class printSubstring {
    public static void main(String[] args) {
        String str = "aaa";
        printSubstrings(str, 0, "");
        uniqueSubstrings(str, 0, "", new HashSet<>());
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
    static void uniqueSubstrings(String str, int idx, String curr, HashSet<String> set){
        if(idx == str.length()){
            if(!set.contains(curr)){
                System.out.println(curr);
                set.add(curr);
            }
            return;
        }

        char currChar = str.charAt(idx);
        uniqueSubstrings(str, idx+1, curr + currChar, set);
        uniqueSubstrings(str, idx+1, curr, set);   
    }
}