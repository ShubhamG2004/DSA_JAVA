package PGP.Week3;

public class Question16 {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();

        if( n2 < n1) return false;

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for(int i=0;i<n1;i++){
            freq1[s1.charAt(i) - 'a']++;
            freq2[s2.charAt(i) - 'a']++;
        }

        if(matches(freq1,freq2))return true;

        for(int i =n1;i<n2;i++){
            freq2[s2.charAt(i) - 'a']++;
            freq2[s2.charAt(i - n1) - 'a']--;

            if(matches(freq1,freq2))return true;
        }

        return false;
    }
    public boolean matches(int[] a1, int[] a2){
        for(int i=0;i<26;i++){
            if(a1[i] != a2[i]) return false;
        }

        return true;
    }
    public static void main(String[] args) {
        Question16 q = new Question16();
        String[][] tests = {
            {"ab","eidbaooo"},   // expected: true
            {"ab","eidboaoo"},   // expected: false
            {"adc","dcda"},      // expected: true
            {"a","ab"},          // expected: true
            {"xyz","afdgzyxksldfm"} // expected: true
        };

        for(String[] t : tests) {
            String s1 = t[0];
            String s2 = t[1];
            boolean res = q.checkInclusion(s1, s2);
            System.out.printf("s1=\"%s\", s2=\"%s\" -> %b%n", s1, s2, res);
        }
    }
}

