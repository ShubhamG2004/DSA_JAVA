import java.util.*;

class Question3 {

    public int countPairs(int[] arr, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int x : arr)
            freq.put(x, freq.getOrDefault(x, 0) + 1);

        int count = 0;

        if (k == 0) {
            for (int f : freq.values()) {
                if (f > 1)
                    count++;
            }
        } else {
            for (int x : freq.keySet()) {
                if (freq.containsKey(x + k))
                    count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Question3 obj = new Question3();

        int[] arr = {1, 5, 3, 4, 2, 2, 3};
        int k = 2;

        System.out.println(obj.countPairs(arr, k));
    }
}