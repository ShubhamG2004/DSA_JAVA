public class binarysS {
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
    static boolean binarySearch(int[] a, int target){
        int st=0,end=a.length-1;
        while(st<=end){
            int mid=(st+end)/2;
            if(a[mid]==target){
                return true;
            }
            else if(target>a[mid]){
                st=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] a={1,3,5,7,9};
        int target=0;
        while(target < 10){
            System.out.printf("%d is in array:%b \n",target,binarySearch(a,0,a.length-1,target));
            System.out.printf("%d is in array:%b \n",target,binarySearch(a,target));
            System.out.println();
            target++;
        }
    }
}
