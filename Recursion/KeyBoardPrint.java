public class KeyBoardPrint {
    public static void main(String[] args) {
        String str = "234";
        printKeyBoard(str, 0, "");
    }
    static String[] keyBoard = {
        ".", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wx","yz"
    };
    static void printKeyBoard(String str, int idx, String curr) {
        if(str.length() == idx) {
            System.out.println(curr);
            return;
        }

        char currChar = str.charAt(idx);
        String mapp = keyBoard[currChar - '0'];

        for(int i=0;i < mapp.length();i++){
            printKeyBoard(str, idx+1, curr + mapp.charAt(i));
        }
    }
}
