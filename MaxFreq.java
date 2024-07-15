import java.util.*;
import java.applet.*;
public class MaxFreq {
    public static void main(String[] args) {
        int[] arr={1,4,3,1,4,5,2,3,4,2,4,5,3,1,2,3,2,1,2,1,1,1,2};
        Map<Integer, Integer> freq=new HashMap<>();
        for(int el:arr){
            if(!freq.containsKey(el)){
                freq.put(el, 1);
            }
            else{
                freq.put(el, freq.get(el)+1);
            }
        }
        System.out.println("Frequency Map:");
        System.out.println(freq.entrySet());

        int MaxFreq=0, anskey=-1;

        for(var el:freq.entrySet()){
            if(el.getValue()>MaxFreq){
                MaxFreq=el.getValue();
                anskey=el.getKey();
            }
        }
        System.err.println(anskey);
    }
}
