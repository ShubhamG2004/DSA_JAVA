import java.util.HashMap;

public class TwoSumPr {
    public static void main(String[] args) {
        int arr[] = {2, 7, 11, 15, 5,4,6,3};
        int target = 9;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int com = target - arr[i];
            if(map.containsKey(com)){
                System.out.println("Indeices: " + map.get(com) + "," + i);
            }
            map.put(arr[i],i);
        }
    }
}
