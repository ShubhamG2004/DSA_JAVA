import java.util.ArrayList;
import java.util.List;

public class PatternMatching {

    // Naive pattern search: returns starting indices (0-based)
    public static List<Integer> naiveSearch(String text, String pat) {
        List<Integer> res = new ArrayList<>();
        int n = text.length();
        int m = pat.length();
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (text.charAt(i + j) != pat.charAt(j)) break;
            }
            if (j == m) res.add(i);
        }
        return res;
    }

    // KMP pattern search: returns starting indices (0-based)
    public static List<Integer> kmpSearch(String text, String pat) {
        List<Integer> res = new ArrayList<>();
        int n = text.length();
        int m = pat.length();
        if (m == 0) return res;
        int[] lps = buildLPS(pat);
        int i = 0, j = 0;
        while (i < n) {
            if (text.charAt(i) == pat.charAt(j)) {
                i++; j++;
                if (j == m) {
                    res.add(i - j);
                    j = lps[j - 1];
                }
            } else {
                if (j != 0) j = lps[j - 1];
                else i++;
            }
        }
        return res;
    }

    private static int[] buildLPS(String pat) {
        int m = pat.length();
        int[] lps = new int[m];
        int len = 0; // length of previous longest prefix suffix
        int i = 1;
        while (i < m) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

    public static void main(String[] args) {
        String text = "ABABDABACDABABCABAB";
        String pat = "ABABCABAB";

        System.out.println("Text: " + text);
        System.out.println("Pattern: " + pat);

        System.out.println("Naive matches: " + naiveSearch(text, pat));
        System.out.println("KMP matches: " + kmpSearch(text, pat));

        // Additional example with multiple/overlapping matches
        String t2 = "AAAAA";
        String p2 = "AAA";
        System.out.println("\nText: " + t2);
        System.out.println("Pattern: " + p2);
        System.out.println("Naive matches: " + naiveSearch(t2, p2));
        System.out.println("KMP matches: " + kmpSearch(t2, p2));
    }
}
