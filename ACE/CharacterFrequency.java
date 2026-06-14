import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeMap;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        TreeMap<Character,Integer> map = new TreeMap<>();

        for(char ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        // System.out.println(map.keySet());

        map.forEach((key,value) -> System.out.println(key + "->" + value ));
    }
}
