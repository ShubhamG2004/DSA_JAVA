public class Sort012 {
    static void display(int[] arr){
        for(int val : arr){
            System.out.print(val+" ");
        }
        System.out.println();
    }
    static void swap(int[]arr,int x, int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    static void sort_Arr(int[] arr){
        int count0=0, count1=0, count2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count0++;
            }
            else if(arr[i]==1){
                count1++;
            }
            else{
                count2++;
            }
        }

        int k =0,mid=0,lo=0,hi=arr.length-1;
        for(int i=0;i<arr.length;i++){
            if(arr[mid]==0){
                swap(arr,mid,lo);
                lo++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(arr,mid,hi);
                hi--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={0,2,1,2,0,1,0,2,1};
        display(arr);
        sort_Arr(arr);
        display(arr);        
    }
}
