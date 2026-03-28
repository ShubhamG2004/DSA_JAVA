package round1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Third {
    public static List<Integer> minOpe(int[] A, int[] B){
        List<Integer> res = new ArrayList<>();
        Set<Integer> hashA = new HashSet<>();
        Set<Integer> hashB = new HashSet<>();
        int commonCount = 0;
        for(int i = 0; i < A.length; i++){
            int left = A[i];
            int right = B[i];
            if(left == right) {
                commonCount++;
            } else if(hashB.contains(left) && hashA.contains(right)){
                commonCount += 2;
            } else if(hashB.contains(left) || hashA.contains(right)){
                commonCount++;
            }
            hashA.add(A[i]);
            hashB.add(B[i]);
            res.add(commonCount);
        }
        return res;
    }
    public static void main(String[] args){
        int[] A = {1,3,2,4};
        int[] B = {3,1,2,4};

        System.out.println(minOpe(A, B));
    }
}
