package Cognizant3;

import java.util.HashSet;

public class FindFirstMissingEvenNum {
    static int FindMissingNum(int[] arr){
        if(arr.length == 0){
            return 2;
        }
        HashSet<Integer> set = new HashSet<>();
        int MaxValue = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
            }
            MaxValue = Math.max(arr[i],MaxValue);
        }

        for(int i=2;i<MaxValue;i=i+2){
            if(!set.contains(i)){
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {10,12,4,2,6,9,10,23,};
        int num =FindMissingNum(arr);
        System.out.println();
        System.out.println("Missing First Num:: "+num);
    }
   
}
