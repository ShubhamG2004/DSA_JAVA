package PGP.Week3;

import java.util.Map;

public class Question8 {
     public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            count[c - 'a']--;
        }

        for (int val : count) {
            if (val != 0) return false;
        }

        return true;
    }
}
