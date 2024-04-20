import java.util.Scanner;

public class lar_sml {
    static int pair_sum(int[] arr)
    {
        int n=arr.length;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                if(arr[i] + arr[j]+arr[k]==8)
                {
                    ans++;
                }
            }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Array Size:");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter the "+n+" Element:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("number of pairs whose sum is the 7 is ="+ pair_sum(arr));
    }
}
