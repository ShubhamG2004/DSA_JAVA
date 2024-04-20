import java.util.Scanner;

public class arra_pr1 {
    static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void SortArr(int[] arr){
        int x=-1,y=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                if(x==-1){
                    x=i-1;
                    y=i;
                }
                else{
                    y=i;
                }
            }
        }

        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int[] arr={3,4,9,6,7,8,5};

            System.out.println("Before Swapping");
            display(arr);
            System.out.println("After Swapping");
            SortArr(arr);
            display(arr);
        
    }
}
