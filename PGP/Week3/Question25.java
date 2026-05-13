package PGP.Week3;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Element implements Comparable<Element>{
    char ch;
    int freq;
    public Element(char ch, int freq){
        this.ch = ch;
        this.freq = freq;
    }
    public int compareTo(Element that){
        return that.freq - this.freq; //dec
    }
}
public class Question25 {
    public String frequencySort(String s) {
        HashMap<Character,Integer> freqMap = new HashMap<>();
        for(char ch : s.toCharArray()){
            freqMap.put(ch,freqMap.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Element> pq = new PriorityQueue<>();
        for(Map.Entry<Character,Integer> entry : freqMap.entrySet()){
            Element element = new Element(entry.getKey(),entry.getValue());
            pq.offer(element);
        }
        //gen res
        StringBuilder str = new StringBuilder();
        while(pq.size()>0){
            Element element = pq.poll();
            while(element.freq>0){
                str.append(element.ch);
                element.freq--;
            }
        }
        return str.toString();
    }
    
    public static void main(String[] args) {
        Question25 solution = new Question25();
        
        // Test case 1: Basic string with mixed frequencies
        String test1 = "tree";
        System.out.println("Test 1: " + test1);
        System.out.println("Output: " + solution.frequencySort(test1));
        System.out.println();
        
        // Test case 2: String with all same frequency
        String test2 = "cccaaa";
        System.out.println("Test 2: " + test2);
        System.out.println("Output: " + solution.frequencySort(test2));
        System.out.println();
        
        // Test case 3: Single character
        String test3 = "a";
        System.out.println("Test 3: " + test3);
        System.out.println("Output: " + solution.frequencySort(test3));
        System.out.println();
        
        // Test case 4: String with numbers and special chars
        String test4 = "aabbcc";
        System.out.println("Test 4: " + test4);
        System.out.println("Output: " + solution.frequencySort(test4));
        System.out.println();
        
        // Test case 5: Empty-like string with one character
        String test5 = "112";
        System.out.println("Test 5: " + test5);
        System.out.println("Output: " + solution.frequencySort(test5));
    }
}
