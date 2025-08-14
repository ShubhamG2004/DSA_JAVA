import java.util.Scanner;

public class minOfferDiscountBuy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); 

        String[] items = new String[n];
        double[] discounts = new double[n];

        for(int i=0;i<n;i++){
            String line = sc.nextLine();
            String[] parts = line.split(",");
            if(parts.length != 3) {
                System.out.println("Invalid input format. Expected: name,price,discountPercent");
                return;
            }
            String name= parts[0];
            double price = Double.parseDouble(parts[1]);
            double discountPercent = Double.parseDouble(parts[2]);

            double discountAmount = price * discountPercent /100.0;

            items[i] = name;
            discounts[i] = discountAmount;
        }

        double minDiscount = discounts[0];
        for(int i=1;i<n;i++){
            if(discounts[i] < minDiscount){
                minDiscount = discounts[i];
            }
        }

        for(int i=0;i<n;i++){
            if(discounts[i] == minDiscount){
                System.out.println(items[i]);
            }
        }
        sc.close();
    }
}
