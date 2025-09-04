import java.util.HashMap;
import java.util.Map;
import java.util.Collections;

public class MostFrequentPairInSentence {
    static String mostFrequentPair(String s){
        String[] words = s.split("\\s+");
        Map<String, Integer> freqMap = new HashMap<>();

        for(String word: words){
            if(word.length()>0){
                String pair = "" + word.charAt(0) + word.charAt(word.length()-1);
                freqMap.put(pair,freqMap.getOrDefault(pair,0)+1);
            }
        }

        int maxFreq = Collections.max(freqMap.values());
        for(String pair:freqMap.keySet()){
            if(freqMap.get(pair) == maxFreq){
                return pair;
            }
        }

        return "";
    }
    public static void main(String[] args) {
        String input = "she is sood srid sod and sround player plotter";
        System.out.println(MostFrequentPairInSentence.mostFrequentPair(input));
    }
}
