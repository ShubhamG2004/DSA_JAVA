public class remDuplicate {
    public static void main(String[] args) {
        String str = "aabbccddeeffgg";
        StringBuilder newStr = new StringBuilder();
        removeDuplicates(str, 0, newStr);
        System.out.println("Original String: " + str);
        System.out.println("Modified String: " + newStr.toString());
    }
    static boolean[] seen = new boolean[26]; // Assuming lowercase letters a-z
    static void removeDuplicates(String str, int idx, StringBuilder newStr) {
        if(idx == str.length()){
            return;
        }

        char currChar = str.charAt(idx);
        if(seen[currChar - 'a'] == true){
            removeDuplicates(str, idx+1, newStr);
        }else{
            seen[currChar - 'a'] = true; 
            newStr.append(currChar);
            removeDuplicates(str, idx + 1, newStr);
        }
    }
}
