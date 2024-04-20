import java.util.*;

public class SumOfAlternative{
	static int  sumAlter(int n){
		if(n==0)return n;
		if(n%2==0){
			return sumAlter(n-1)-n;
		}
		else{
			return sumAlter(n-1)+n;
		}
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.println(sumAlter(n));
	}
}