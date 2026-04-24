package PGP.Week2;

import java.util.*;

public class Question7 {
    static class Solution {
        public ArrayList<Integer> findDuplicates(int[] arr) {
            Set<Integer> seen = new HashSet<>();
            ArrayList<Integer> result = new ArrayList<>();
            
            for (int num : arr) {
                if (seen.contains(num)) {
                    result.add(num);
                } else {
                    seen.add(num);
                }
            }
            
            return result;
        }
    }
}
