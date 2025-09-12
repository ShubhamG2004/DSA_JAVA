package Cognizant3;
import java.util.Map;
import java.util.HashMap;

public class GetMaxFreqFreq {
    public static int getMaxFreq(int N, String S){
        // Step 1 : Count frenecy of each Character
        Map<Character, Integer> charFreq = new HashMap<>();
        for(char freq:S.toCharArray()){
            charFreq.put(freq, charFreq.getOrDefault(freq,0)+1);
        }

        // Step2 : Count how many times each freauency come
        Map<Integer, Integer> countFreq = new HashMap<>();
        for(int count:charFreq.values()){
            countFreq.put(count, countFreq.getOrDefault(count,0)+1);
        }

        // Step3 : Find the Maximum Occurence of the Frequency Count
        int maxOccurence = 0;
        int result = Integer.MAX_VALUE;

        for(Map.Entry<Integer, Integer> entry : countFreq.entrySet()){
            int freauency = entry.getKey();
            int occ = entry.getValue();

            if(occ > maxOccurence || (occ == maxOccurence && freauency < result)){
                maxOccurence = occ;
                result = freauency;
            }
        }

        return result;
    }
    public static void main(String[] args){
        System.out.println(GetMaxFreqFreq.getMaxFreq(9, "ACABABCCA")); // Output: 2
        System.out.println(GetMaxFreqFreq.getMaxFreq(10, "AAA")); // Example: each freq=2 → output 2
        System.out.println(GetMaxFreqFreq.getMaxFreq(7, "AABBBCC")); 
    }
}
