public class fisrtocc {
    static int firstoc(int[] a, int tar){
        int st=0,end=a.length-1;
        int fo=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(a[mid]==tar){
                fo=mid;
                end=mid-1;
            }
            else if(a[mid]>tar){
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return fo;

    }
    public static void main(String[] args) {
        int[] a={1,3,3,4,4,5,6,7,7,9};
        int target=0;
        while(target < 10){
            System.out.printf("%d is in array:%d\n",target,firstoc(a,target));
            System.out.println();
            target++;
        }
    }
}
