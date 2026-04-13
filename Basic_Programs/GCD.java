import java.util.*;

public class GCD{
	
	static int findGCD(int x, int y){
		while(x%y!=0)
		{
			int rem=x%y;
			x=y;
			y=rem;
		}
		return y;
		
	}
	
	static int recGCD(int x, int y){
		if(y==0)
		{
			return x;
		}
		
		return recGCD(y,x%y);
	}
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int m=sc.nextInt();
		
		System.out.println("By using the Euclids Algorithms:"+findGCD(n,m));
		
		System.out.println("By using Recursion:"+recGCD(n,m));
	}
}  