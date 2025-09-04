import java.util.*;

public class StringExpander {
    public static String expandString(String s) {
        Map<Character, Integer> firstIndex = new HashMap<>();
        StringBuilder result = new StringBuilder();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            firstIndex.putIfAbsent(ch,i+1);

            int repeatCount = firstIndex.get(ch);

            for(int j=0;j<repeatCount;j++){
                result.append(ch);
            }

            if(i < s.length()-1){
                result.append("-");
            }
        }

        return (result.length() > 0) ? result.toString() : "";
    }

    public static void main(String[] args) {
        String input = "";
        String output = expandString(input);
        System.out.println("Output: " + output);
    }
}
