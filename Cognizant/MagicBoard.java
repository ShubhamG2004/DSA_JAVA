import java.util.Scanner;

public class MagicBoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter numbers separated by spaces: ");
        String[] numbers = sc.nextLine().split(" ");
        
        StringBuilder result = new StringBuilder();
        for (String numStr : numbers) {
            int num = Integer.parseInt(numStr);
            result.append((char) num); 
        }
        
        System.out.println("Output: " + result.toString());
        sc.close();
    }
}
