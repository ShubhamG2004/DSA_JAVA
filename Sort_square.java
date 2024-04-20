import java.util.Arrays;
import java.util.Scanner;


public class Sort_square {
    static void printArray(int[] arr)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    static void swap_array(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    static void reverse(int[] arr)
    {
       int i=0,j=arr.length-1;
       while(i<j)
       {
            swap_array(arr,i,j);
            i++;
            j--;
       }
    }

    static int[] sort_squ(int[] arr){

    int left=0;
    int n=arr.length;
    int right=n-1;
    int[] ans=new int[n];
    int k=0;


    while(left<=right)
    {
        if(Math.abs(arr[left])>Math.abs(arr[right])){
            ans[k++]=arr[left]*arr[left];
            left++;
        }
        else{
            ans[k++]=arr[right]*arr[right];
            right--;
        }
    }
    Arrays.sort(ans);
    return ans;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Size:");
        int n=sc.nextInt();

        int[] arr=new int[n];

        System.out.println("Enter the Elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int[] ans = sort_squ(arr);
        reverse(ans);
        printArray(ans);
    }
}
