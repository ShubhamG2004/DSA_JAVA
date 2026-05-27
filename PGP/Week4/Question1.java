class Question1 {
    public void reverseString(char[] s) {
        if (s == null || s.length <= 1) return;
        reverseHelper(s, 0, s.length - 1);
    }

    private void reverseHelper(char[] s, int left, int right) {
        if (left >= right) return;
        char tmp = s[left];
        s[left] = s[right];
        s[right] = tmp;
        reverseHelper(s, left + 1, right - 1);
    }

    public static void main(String[] args) {
        Question1 q = new Question1();
        char[] s = "hello".toCharArray();
        System.out.println("Before: " + new String(s));
        q.reverseString(s);
        System.out.println("After: " + new String(s));
    }
}