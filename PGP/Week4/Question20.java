import java.util.*;

class Question20 {

    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();

        if (s.length() < 4 || s.length() > 12) {
            return result;
        }

        buildIp(s, 0, 0, new ArrayList<>(), result);
        return result;
    }

    private void buildIp(String s, int index, int parts,
                         List<String> current, List<String> result) {

        if (parts == 4) {
            if (index == s.length()) {
                result.add(String.join(".", current));
            }
            return;
        }

        int remainingDigits = s.length() - index;
        int remainingParts = 4 - parts;

        if (remainingDigits < remainingParts ||
            remainingDigits > remainingParts * 3) {
            return;
        }

        for (int len = 1; len <= 3 && index + len <= s.length(); len++) {

            String segment = s.substring(index, index + len);

            if (segment.length() > 1 && segment.charAt(0) == '0') {
                break;
            }

            int value = Integer.parseInt(segment);

            if (value > 255) {
                break;
            }

            current.add(segment);

            buildIp(s, index + len, parts + 1, current, result);

            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        // Test Case 1
        String s1 = "25525511135";
        System.out.println("Input: " + s1);
        System.out.println("Output: " + obj.restoreIpAddresses(s1));

        // Test Case 2
        String s2 = "0000";
        System.out.println("\nInput: " + s2);
        System.out.println("Output: " + obj.restoreIpAddresses(s2));

        // Test Case 3
        String s3 = "101023";
        System.out.println("\nInput: " + s3);
        System.out.println("Output: " + obj.restoreIpAddresses(s3));
    }
}