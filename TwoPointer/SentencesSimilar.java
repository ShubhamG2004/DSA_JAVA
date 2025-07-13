package TwoPointer;
public class SentencesSimilar {
    public static void main(String[] args) {
        String[] words1 = {"I", "love", "leetcode"};
        String[] words2 = {"I", "love", "coding"};
        String[] words3 = {"I", "hate", "leetcode"};

        System.out.println(areSentencesSimilar(words1, words2)); // true
        System.out.println(areSentencesSimilar(words1, words3)); // false
    }

    public static boolean areSentencesSimilar(String[] words1, String[] words2) {
        if (words1.length != words2.length) return false;

        int n = words1.length;
        int left = 0, right = n - 1;

        while (left < n && words1[left].equals(words2[left])) left++;
        while (right >= 0 && words1[right].equals(words2[right])) right--;

        return left > right;
    }
}
