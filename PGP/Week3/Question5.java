package PGP.Week3;

public class Question5 {
    public int maxDepth(String s) {
        int maxDepth = 0;
        int depth = 0;
        for(char ch:s.toCharArray()){
            if(ch == '('){
                depth++;
                maxDepth = Math.max(maxDepth,depth);
            }
            else if(ch == ')'){
                depth--;
            }
        }

        return maxDepth;
    }
}
