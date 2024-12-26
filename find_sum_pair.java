import java.util.*;

class FindSumPair {
    public static  int[] findpair(int input1, int[] input2) {

        int[] arr = new int[2];
        Arrays.sort(input2);
        int fr = -1;
        int sc = -1;
        int i = 0;
        int j = input1 - 1;

        while (i < j) {  
            if (input2[i] + input2[j] == 18) {  
                if (input2[i] > input2[j]) {
                    fr = input2[i];
                    sc = input2[j];
                } 
                else {
                    fr = input2[j];
                    sc = input2[i];
                }
                break;  
            } 
            else if (input2[i] + input2[j] < 18) {
                i++;
            } 
            else {
                j--;
            }
        }

        if (fr == -1 || sc == -1) {
            return new int[0];  
        } else {
            arr[0] = fr;
            arr[1] = sc;
        }

        return arr;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] c=findpair(n,arr);
        for(int i=0;i<2;i++){
            System.out.print(c[i]+" ");
        }
    }
}
