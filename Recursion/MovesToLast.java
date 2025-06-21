public class MovesToLast {
    public static void main(String[] args) {
        String str = "xxxabcbabc";
        System.out.println("Original String: " + str);
        StringBuilder newStr = new StringBuilder();
        // 
        String result = moveAllXToEnd(str, 0, 0, newStr);
        System.out.println("Modified String: " + result);
    }
    static String moveAllXToEnd(String str, int idx, int count, StringBuilder newStr) {

        if(idx == str.length()){
            for(int i=0;i<count;i++){
                newStr.append('x');
            }
            return newStr.toString();
        }
        
        char currChar = str.charAt(idx);
        if( currChar == 'x'){
            count++;
            return moveAllXToEnd(str, idx+1, count, newStr);
        }else{
            newStr.append(currChar);
            return moveAllXToEnd(str, idx+1, count, newStr);
        }
    }
}
