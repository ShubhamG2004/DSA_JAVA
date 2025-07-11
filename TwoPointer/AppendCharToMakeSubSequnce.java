package TwoPointer;

public class AppendCharToMakeSubSequnce {
    public static void main(String[] args) {
        String s = "abcdeghhijk";
        String t = "dfytesfh";
        int result = appendCharToMakeSubsequence(s, t);
        System.out.println();
        System.out.println(result); 
    }

    public static int appendCharToMakeSubsequence(String s, String t) {
        int i =0;
        int j = 0;
        int sLen = s.length();
        int tLen = t.length();

        while(i<sLen && j<tLen){
            if(s.charAt(i)==t.charAt(j)){
                j++;
            }
            i++;
        }

        return tLen - j;
    }
}
