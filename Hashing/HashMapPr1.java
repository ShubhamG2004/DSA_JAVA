import java.util.*;

public class HashMapPr1 {
    static int mostFrequentEle(int[] arr){
        HashMap<Integer, Integer> mp=new HashMap();
        int maxfreq=0;
        int ans=-1;

        for(int i=0;i<arr.length;i++){
            if(mp.containsKey(arr[i])){
                int val=mp.get(arr[i]);
                val+=1;
                mp.put(arr[i],val);
            }
            else{
                mp.put(arr[i],1);
            }

            if(mp.get(arr[i])>maxfreq){
                maxfreq=mp.get(arr[i]);
                ans=arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,2,4,2,3,5,1,1,1};
        int val=mostFrequentEle(arr);
        System.out.println(val);
    }
}
