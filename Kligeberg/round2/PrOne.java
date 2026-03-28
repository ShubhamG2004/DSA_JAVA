package round2;

import java.util.Arrays;
import java.util.List;

public class PrOne {

    public static int findChem(int[] input, int target){
        Arrays.sort(input);
        int n = input.length;
        int i = 0;
        int j = n - 1;
        int res = 0;
        while(i <= j){
            if(input[i] + input[j] == target){
                res += input[i] * input[j];
                i++;
                j--;
            } else {
                return -1;
            }
        }
        return res;
    }
    public static void main(String[] args){
        int[] input = {3, 2, 5, 1, 3, 4};
        int target = 0;
        for(int i = 0; i < input.length; i++){
            target += input[i];
        }
        target = target / (input.length/2);

//        System.out.println("target : " + target);
        int res = findChem(input, target);
        System.out.println(res);
    }

}
