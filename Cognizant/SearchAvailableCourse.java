import java.util.Scanner;

public class SearchAvailableCourse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of course:");
        int course = sc.nextInt();

        if (course <= 0 || course > 20) {
            System.out.println("Invalid Range");
            sc.close();
            return;
        }

        String[] courseArr = new String[course];
        System.out.println("Enter the course names:");
        for (int i = 0; i < course; i++) {
            courseArr[i] = sc.next().trim();
        }

        // Consume leftover newline before nextLine
        sc.nextLine();

        System.out.println("Enter the course names:");
        for (int i = 0; i < course; i++) {
             System.out.println(courseArr[i]+" ");
        }

        System.out.println("Enter the course to be searched:");
        String searchCourse = sc.nextLine().trim();

        boolean found = false;

        for (int i = 0; i < course; i++) {
            if (courseArr[i].equalsIgnoreCase(searchCourse)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(searchCourse + " course is available");
        } else {
            System.out.println(searchCourse + " course is not available");
        }

        sc.close();
    }
}
