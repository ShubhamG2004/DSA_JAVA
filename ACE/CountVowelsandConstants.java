public class CountVowelsandConstants {
    public static void main(String[] args) {
        String str = "Shubham";

        int vowels = 0;
        int consonants = 0;

        for(char ch : str.toCharArray()){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') vowels++;
            else if(Character.isLetter(ch)) consonants++;
        }

        System.out.println("vowels: " + vowels + " " + "consonants: "+consonants);
    }   
}
