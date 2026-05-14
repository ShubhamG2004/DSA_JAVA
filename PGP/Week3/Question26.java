package PGP.Week3;

public class Question27 {
    public String reverseWords(String s) {

        StringBuilder res = new StringBuilder();

        int startIndex = s.length() - 1;

        while(startIndex >= 0){

            while(startIndex >= 0 && s.charAt(startIndex) == ' '){
                startIndex--;
            }

            if(startIndex < 0){
                break;
            }

            int endIndex = startIndex;

            while(startIndex >= 0 && s.charAt(startIndex) != ' '){
                startIndex--;
            }

            if(res.length() > 0){
                res.append(" ");
            }

            res.append(s.substring(startIndex + 1, endIndex + 1));
        }

        return res.toString();
    }

    public static void main(String[] args) {
        Question27 solver = new Question27();

        String[] testInputs = {
            "the sky is blue",
            "  hello world  ",
            "a good   example",
            "single",
            "    "
        };

        String[] expectedOutputs = {
            "blue is sky the",
            "world hello",
            "example good a",
            "single",
            ""
        };

        for (int i = 0; i < testInputs.length; i++) {
            String actual = solver.reverseWords(testInputs[i]);
            boolean passed = actual.equals(expectedOutputs[i]);

            System.out.println("Test " + (i + 1) + ": " + (passed ? "PASS" : "FAIL"));
            System.out.println("Input:    [" + testInputs[i] + "]");
            System.out.println("Expected: [" + expectedOutputs[i] + "]");
            System.out.println("Actual:   [" + actual + "]");
            System.out.println();
        }
    }

}
