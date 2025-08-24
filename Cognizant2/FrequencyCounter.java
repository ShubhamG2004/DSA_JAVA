package Cognizant2;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class FrequencyCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the N Number");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int num:arr){
            freqMap.put(num,freqMap.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer, Integer> entry:freqMap.entrySet()){
            System.out.println("The Frequncy of "+entry.getKey()+" in the array is: " + entry.getValue());
        }
    }
}
