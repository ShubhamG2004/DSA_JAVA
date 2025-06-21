public class RemoveDuplicate {
    
    public static void main(String[] args) {

        String str = "aabbccddeeffggff";
        StringBuilder newStr = new StringBuilder();
        removeDuplicates(str, 0, newStr);
        System.out.println("Original String: " + str);
        System.out.println("Modified String: " + newStr.toString());
    }
    static void removeDuplicates(String str, int idx, StringBuilder newStr) {
        if(idx == str.length()){
            return;
        }
        char currChar = str.charAt(idx);
        if(newStr.length()==0 || newStr.charAt(newStr.length()-1) != currChar){
            newStr.append(currChar);
            removeDuplicates(str, idx + 1, newStr);
        } else {
            removeDuplicates(str, idx+1, newStr);
        }
    }
}
