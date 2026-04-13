import java.util.HashSet;

public class HasheSet1 {
    public static int maxNum(int[] bag){
        HashSet<Integer> table=new HashSet<>();
        int maxnum=0;
        for(int i=0;i<bag.length;i++){
            int num=bag[i];
            if(table.contains(num)){
                table.remove(num);
            }
            else{
                table.add(num);
                maxnum=Math.max(maxnum, table.size());
            }
        }
        return maxnum;
    }
    public static void main(String[] args) {
        int arr[]={1,1};
        System.out.println(maxNum(arr));
    }
}
