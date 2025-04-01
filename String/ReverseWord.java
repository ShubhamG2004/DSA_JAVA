package String;

public class ReverseWord {
    public static String reverseWords2(String str){
        StringBuilder res= new StringBuilder();

        int StartIdx =str.length()-1;
        while(StartIdx >=0){
            while(str.charAt(StartIdx) == ' '){
                StartIdx--;
            }

            if(StartIdx < 0){
                break;
            }

            int EndIdx = StartIdx;
            while(StartIdx >= 0 && str.charAt(StartIdx) != ' '){
                StartIdx--;
            }
            if(res.length() == 0){
                res.append(str.substring(StartIdx+1, EndIdx+1));
            }
            else{
                res.append(" ");
                res.append(str.substring(StartIdx+1, EndIdx+1));
            }
        }
        return res.toString();
        
    }
    public static String reverseWords(String str){
        String arr[] = str.split(" ");
        StringBuilder res= new StringBuilder();

        for(int i=arr.length-1;i>=0;i--){
            if(arr[i].length() == 0){
                continue;
            }

            if(res.length() == 0){
                res.append(arr[i]);
            }
            else{
                res.append(" ");
                res.append(arr[i]);
            }
        }
        return res.toString();
    }
    public static void main(String[] args) {
        String str = "hello world";
        System.out.println("Original String: " + str);
        String reversed = reverseWords2(str);
        System.out.println("Reversed String: " + reversed);
    }
}
