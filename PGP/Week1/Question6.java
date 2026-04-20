class Solution {
    public String multiplyStrings(String s1, String s2) {
        boolean negative = false;

        if (s1.charAt(0) == '-') {
            negative = !negative;
            s1 = s1.substring(1);
        }

        if (s2.charAt(0) == '-') {
            negative = !negative;
            s2 = s2.substring(1);
        }

        s1 = removeLeadingZeros(s1);
        s2 = removeLeadingZeros(s2);

        if (s1.equals("0") || s2.equals("0")) {
            return "0";
        }

        int n1 = s1.length();
        int n2 = s2.length();

        int[] res = new int[n1 + n2];

        for (int i = n1 - 1; i >= 0; i--) {
            for (int j = n2 - 1; j >= 0; j--) {
                int mul = (s1.charAt(i) - '0') * (s2.charAt(j) - '0');
                int sum = mul + res[i + j + 1];

                res[i + j + 1] = sum % 10;
                res[i + j] += sum / 10;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int num : res) {
            if (!(sb.length() == 0 && num == 0)) {
                sb.append(num);
            }
        }

        if (negative) {
            sb.insert(0, '-');
        }

        return sb.toString();
    }

    private String removeLeadingZeros(String s) {
        int i = 0;
        while (i < s.length() - 1 && s.charAt(i) == '0') {
            i++;
        }
        return s.substring(i);
    }
}





/*
Approach:
Simulate grade-school multiplication using an integer array to hold digit-wise products.

Explanation:
Handle sign and leading zeros, multiply each pair of digits from right to left,
store carry and remainder in result array, then build the final string.
*/
