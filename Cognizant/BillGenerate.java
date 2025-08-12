import java.util.Scanner;

public class BillGenerate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalPrice;
        System.out.println();


        System.out.println("Enter total number of prizza Brought");
        int pizza = sc.nextInt();

        System.out.println("Enter total number of puffs Brought");
        int puff = sc.nextInt();

        System.out.println("Enter total number of Coldrinks Brought");
        int Coldrink = sc.nextInt();

        int pizzas = Math.abs(pizza) * 100;
        int puffs = Math.abs(puff) * 60;
        int Coldrinks = Math.abs(Coldrink) * 50;

        System.out.println("Total Number od Pizzas: "+pizzas);
        System.out.println("Total Number of Pizzas: "+puffs);
        System.out.println("Total Number of Pizzas: "+Coldrinks);
        totalPrice = pizzas + puffs + Coldrink;

        System.out.println("Total Bill:: "+totalPrice);

    }
}
