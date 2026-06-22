public class Question10 {
    static void generate(String str, int idx, StringBuilder curr) {

        if (idx == str.length()) {
            System.out.println(curr);
            return;
        }

        // Include
        curr.append(str.charAt(idx));
        generate(str, idx + 1, curr);

        // Backtrack
        curr.deleteCharAt(curr.length() - 1);

        // Exclude
        generate(str, idx + 1, curr);
    }

    public static void main(String[] args) {
        String str = "abc";
        generate(str, 0, new StringBuilder());
    }
}
