import java.util.Scanner;

public class SalaryByPerformance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter the Performance appraisal rating: ");
        double rating = sc.nextDouble();

        if (rating > 1 && rating < 3) {
            salary += salary * 0.10;
        } else if (rating > 3 && rating <= 4) {
            salary += salary * 0.25;
        } else {
            salary += salary * 0.30; 
        }

        System.out.println("Updated Salary: " + salary);
        sc.close();
    }
}
