import java.util.*;
public class multiple{
	static void mul(int n,int k){
		if(k==1)
		{
			System.out.println(n);
			return;
		}
		
		mul(n,k-1);
		 
		System.out.println(n*k);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Entet the number:");
		int n = sc.nextInt();
		System.out.println("Entet the number k time:");
		int k = sc.nextInt();
		mul(n,k);
	}
}