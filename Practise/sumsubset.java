public class sumsubset {
    static void sumsub(int[]a, int n, int idx, int sum){
        if(idx>=n){
            System.out.println(sum);
            return;
        }
        sumsub(a,n,idx+1,sum + a[idx]);
        sumsub(a,n,idx+1,sum);
    }
    public static void main(String[] args) {
        int[] a={2,3,5};
        sumsub(a,a.length,0,0);
    }
}
