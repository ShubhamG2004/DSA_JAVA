import java.util.Scanner;

class algebra{
    int add(int a, int b)
    {
        int ans=a+b;
        return ans;
    }
}

public class method1 {
    public static void main(String[] args) {
        algebra al=new algebra();
        Scanner sc =new Scanner(System.in);
        int x=sc.nextInt();
        int y= sc.nextInt();

        System.out.println("Two numbers sum:");
        int ans=al.add(x,y);
        System.out.println(ans);
    }
}
