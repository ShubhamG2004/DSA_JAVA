package String;

import java.util.Arrays;

public class CheckAnagram {
    static boolean Anagram2(String a, String b){
        if(a.length() != b.length()){
            return false;
        }

        int[] freq = new int[26];
        int len = a.length();

        int index= 0;
        while(index<len){
            char ch = a.charAt(index);
            int freqNum = ch - 97;

            freq[freqNum] += 1;

            char chb = b.charAt(index);
            int freqNum2 = chb - 97;
            
            freq[freqNum2] -= 1;

            index++;
        }

        for(int i=0;i<len;i++){
            if(freq[i] != 0 ){
                return false;
            }
        }

        return true;
    }
    static boolean Anagram(String a, String b){

        if(a.length() != b.length()){
            return false;
        }
        char[] aArr = a.toCharArray();
        char[] bArr = b.toCharArray();

        Arrays.sort(aArr);
        Arrays.sort(bArr);

        int aIdx = 0;
        int bIdx = 0;
        int len = aArr.length;

        while(aIdx<len && bIdx<len){
            if(aArr[aIdx] != bArr[bIdx]){
                return false;
            }
            aIdx++;
            bIdx++;
        }
        return true;
    }
    public static void main(String[] args) {
        String a= "abcd";
        String b = "bacd";
        System.out.println();
        System.out.println(Anagram(a, b));
        System.out.println(Anagram2(a, b));

    }
}
