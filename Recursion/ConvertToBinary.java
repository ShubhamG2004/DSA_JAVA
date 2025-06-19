import java.util.Scanner;

public class ConvertToBinary {
    	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
		int N = sc.nextInt();
		System.out.print("Binary representation: ");
		dectToBinary(N);
	}
	static void dectToBinary(int num){
	    if(num == 0 ){
	        return;
	    }
	    
	    dectToBinary(num/2);
	    System.out.print(num%2);
	}
}
