public class low_cost{
    static int best(int[] a,int n,int idx){
        if(idx == n-1) 
        return 0;

        int opt1 = Math.abs(a[idx] - a[idx+1]) + best(a, n, idx+1);
        if(idx == n-2) return opt1;
        int opt2 = Math.abs(a[idx] - a[idx+1]) + best(a, n, idx+2);
        
        return Math.min(opt1, opt2);
    }
    public static void main(String []args){
        int[] a={10, 30, 40, 20};
        System.out.println(best(a,a.length,0));
    }
}