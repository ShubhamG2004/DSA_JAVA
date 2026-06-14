import java.util.HashSet;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        String str = "aabbccddeeffggii";

        HashSet<Character> set = new HashSet<>();
        for(char ch : str.toCharArray()){
            set.add(ch);
        }

        StringBuilder res = new StringBuilder();

        for(char ch:set){
            res.append(ch);
        }

        System.out.println(res.toString());

    }
}
