package Cognizant2;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class RepeatingElements {

    public static List<Integer> findRepeatingElements(int[] arr){
        List<Integer> result = new ArrayList<>();

        Map<Integer, Integer> freqMap = new HashMap();


        for(int num:arr){
            freqMap.put(num, freqMap.getOrDefault(num, 0)+1);
        }

        for(Map.Entry<Integer, Integer> entry: freqMap.entrySet()){
            if (entry.getValue() > 1 ) {
                result.add(entry.getKey());
            }
        }

        return result;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the N Number:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the Nth Number: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        List<Integer> repeating = findRepeatingElements(arr);

        if(repeating.isEmpty()){
            System.out.println("No Repeating Elementin the Array..");
        }
        else{
            System.out.println("THE Repeating Elements Are:");
            for(int num:repeating){
                System.out.print(num+" ");
            }
        }
    }
}
