import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class pre_fix {
    

    static int[] pre_sum(int[] arr)
    {
        int n=arr.length;
        for(int i=1;i<n;i++)
        {
            arr[i]+=arr[i-1];
        }
        return arr;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of array:");
    
        int n=sc.nextInt();
        int[] arr=new int[n+1];
        System.out.println("Enter the "+n+"element:");

        for(int i=1;i<=n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int[] prefix=pre_sum(arr);

        System.out.println("Enter the Queies:");
        int q=sc.nextInt();

        while(q-- > 0){
            System.out.println("enter the range:");
            int l=sc.nextInt();
            int r=sc.nextInt();
            
            int ans=prefix[r]-prefix[l-1];

            System.out.println("sum:"+ans);
        }

    }
}
