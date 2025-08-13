import java.util.Scanner;

public class findHighestPlacement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("CSE Placed Student: ");
        int cse = sc.nextInt();
        System.out.println("ECE Placed Student: ");
        int ece = sc.nextInt();
        System.out.println("MECH Placed Student: ");
        int mech = sc.nextInt();

        if(cse == ece && ece==mech){
            System.out.println("None of the department has got the highest placement.");
        }
        else if(cse < 0 ||  ece < 0 && mech < 0){
            System.out.println("Input is Invalid");
        }
        else{
            if(cse > ece && cse > mech){
                System.out.println("Highest Placement: CSE");
            }
            else if(ece > cse && ece > mech){
                System.out.println("Highest Placement: ECE");
            }
            else if(mech > cse && mech > cse){
                System.out.println("Highest Placement: MECH");
            }
            else{
                System.out.println("Invalid Output");

            }
        }

        sc.close();
    }
}
