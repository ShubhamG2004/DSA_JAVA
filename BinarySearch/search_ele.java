import java.util.Scanner;
public class search_ele {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int flag=0;
        System.out.println("Enter the number to search:");
        int n=sc.nextInt();
        int[] arr={23,43,54,65};

        
        for(int i=0; i<arr.length; i++)
        {
            if(n==arr[i])
            {
                System.out.println(n+" found at the "+(i+1));
                flag=1;
            }
            
        }
        if(flag!=1){
            System.out.println("No found");
        }
    }
}
