public class RecBinsea {
    static boolean binarySearch(int[] a, int st, int end, int tar){
        if(st>end){
            return false;
        };
        int mid=(st+end)/2;
        if(a[mid]==tar){
            return true;
        }
        else if(tar>a[mid]){
            return binarySearch(a, mid+1, end, tar);
        }
        else{
            return binarySearch(a, st, mid-1, tar);
        }
    }
    public static void main(String[] args) {
        int[] a={1,3,5,7,9};
        int tar=0;
        
        while(tar<=10){
            System.out.printf("%d is in array:%b",tar,binarySearch(a,0,a.length-1,tar));
            System.out.println();
            tar++;
        } 
    }
}
