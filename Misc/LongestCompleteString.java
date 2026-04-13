import java.util.*;

public class LongestCompleteString {

    static class TrieNode {
        Map<Character, TrieNode> children = new HashMap<>();
        boolean isEndOfWord = false;
        String word = "";  // Store the full word at end
    }

    static TrieNode root = new TrieNode();

    // Insert word into Trie
    private static void insert(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            node.children.putIfAbsent(ch, new TrieNode());
            node = node.children.get(ch);
        }
        node.isEndOfWord = true;
        node.word = word;
    }

    public static String longestWord(String[] words) {
        for (String word : words) insert(word);

        String result = "";

        // BFS using queue
        Queue<TrieNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TrieNode node = queue.poll();

            for (char ch = 'a'; ch <= 'z'; ch++) {
                TrieNode child = node.children.get(ch);
                if (child != null && child.isEndOfWord) {
                    queue.offer(child);
                    // update result if longer or lex smaller
                    if (child.word.length() > result.length() || 
                       (child.word.length() == result.length() && child.word.compareTo(result) < 0)) {
                        result = child.word;
                    }
                }
            }
        }

        return result;
    }

    public static void LongestCompleteStringmain(String[] args) {
        String[] words1 = {"p", "pr", "pro", "probl", "problem", "pros", "process", "processor"};
        System.out.println(longestWord(words1));  // Output: pros

        String[] words2 = {"ab", "a", "abc", "abd"};
        System.out.println(longestWord(words2));  // Output: abc
    }
}
