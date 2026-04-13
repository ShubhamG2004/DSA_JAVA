import java.util.Scanner;

public class find_second {
    static int findmx(int[] arr)
    {                                                                                                   
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {                                                              
            if(arr[i]>mx)
            {
                mx=arr[i];
            }
        }
        return mx;
    }

    static int second_mx(int[] arr)
    {
        int mx= findmx(arr);

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==mx)
            {
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int secondMax=findmx(arr);
        return secondMax;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Array's Size:");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter the Element:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        System.out.println("Second maximum element is:" + second_mx(arr));
    }
}
