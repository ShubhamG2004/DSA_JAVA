package Cognizant2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NonRepeatingElements {
    static List<Integer> findNonRepeatingElemnets(int[] arr){
        Map<Integer, Integer> freqMap = new HashMap<>();
        
        for(int num : arr){
            freqMap.put(num, freqMap.getOrDefault(num,0)+1);
        }

        List<Integer> result = new ArrayList<>();

        for(Map.Entry<Integer,Integer> entry:freqMap.entrySet()){
            if(entry.getValue() == 1){
                result.add(entry.getKey());
            }
        }

        return result;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the Nth Number:: ");
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        List<Integer> result = findNonRepeatingElemnets(arr);

        if(result.isEmpty()){
            System.out.println("Non Elemnts Is Found!!!");
        }
        else{
            for(int num : result){
            System.out.println("Elemnts are:: ");
                System.out.print(num+" ");
            }
        }
    }
}
