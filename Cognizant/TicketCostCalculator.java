import java.util.Scanner;

public class TicketCostCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of ticket:");
        int tickets = sc.nextInt();

        if(tickets < 5 || tickets > 40){
            System.out.println("Minimum of 5 and Maximum of 40 Tickets");
            return;
        }

        System.out.println("Do you want Refreshment:");
        char Refreshment = sc.next().toLowerCase().charAt(0);

        System.out.println("Do you have coupon code:");
        char coupon = sc.next().toLowerCase().charAt(0);

        System.out.println("Enter the Circle:");
        char circle = sc.next().toLowerCase().charAt(0);

        if(circle != 'k' && circle != 'q'){
            System.out.println("Invalid Output");
            return;
        }

        double ticketPrice = (circle == 'k') ? 75:100;

        double total = tickets * ticketPrice;

        if(tickets > 20){
            total *= 0.90; 
        }

        if(coupon == 'y'){
            total *= 0.98;
        }

        if(Refreshment == 'y'){
            total += (tickets * 50);
        }

        System.out.printf("%.2f\n", total);
    }   
}
