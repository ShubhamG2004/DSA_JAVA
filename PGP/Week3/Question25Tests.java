package PGP.Week3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question25Tests {
    static Question25 sol = new Question25();

    static void runCase(String name, String input) {
        String out = sol.frequencySort(input);
        boolean ok = validate(input, out);
        System.out.printf("%s: input=\"%s\" => output=\"%s\" => %s\n", name, input, out, ok ? "PASS" : "FAIL");
        if (!ok) {
            System.out.println("  Expected matching character multiset and non-increasing group frequencies.");
        }
    }

    static boolean validate(String in, String out) {
        if (in == null) return out == null;
        if (in.length() != out.length()) return false;

        Map<Character, Integer> a = new HashMap<>();
        for (char c : in.toCharArray()) a.put(c, a.getOrDefault(c, 0) + 1);
        Map<Character, Integer> b = new HashMap<>();
        for (char c : out.toCharArray()) b.put(c, b.getOrDefault(c, 0) + 1);
        if (!a.equals(b)) return false;

        // Ensure characters are grouped and group sizes are non-increasing
        List<Integer> groups = new ArrayList<>();
        for (int i = 0; i < out.length(); ) {
            char c = out.charAt(i);
            int j = i;
            while (j < out.length() && out.charAt(j) == c) j++;
            groups.add(j - i);
            i = j;
        }
        for (int i = 1; i < groups.size(); i++) {
            if (groups.get(i) > groups.get(i - 1)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        runCase("Basic", "tree");
        runCase("All same frequency", "abcabc");
        runCase("Single char", "aaaa");
        runCase("Empty", "");
        runCase("Numbers & special", "112233!!");
        runCase("Mixed case", "AaBbA");
        runCase("Unicode", "ααβββγ");
        runCase("Long", "aaaaabbbbcccdde");
    }
}
