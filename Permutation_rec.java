public class Permutation_rec {
    public static void printp(String str, String s){
        if(str.equals("")){
            System.out.println(s);
            return;
        }

        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            String left= str.substring(0, i);
            String right= str.substring(i+1);
            String rem= left + right;
            printp(rem, s+ch);
        }
    }
    public static void main(String[] args) {
        String str= "abc";
        printp(str,"");
    }
}
