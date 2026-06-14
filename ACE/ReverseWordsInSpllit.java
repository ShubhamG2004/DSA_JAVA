public class ReverseWordsInSpllit {
    public static void main(String[] args) {
        String name = "I LOVE SHUBHAM";

        String[] strArr = name.split(" ");

        for(int i = strArr.length-1; i>=0;i--){
            System.out.print(strArr[i] + " ");
        }

    }
}
