package PGP.Week3;

public class Question6 {
    class Solution {
    public int romanToInt(String s) {
        int n = s.length();
        int total = 0;

        for (int i = 0; i < n; i++) {
            int value = getValue(s.charAt(i));

            if (i < n - 1 && value < getValue(s.charAt(i + 1))) {
                total -= value;
            } else {
                total += value;
            }
        }

        return total;
    }

    private int getValue(char ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }
}
}
