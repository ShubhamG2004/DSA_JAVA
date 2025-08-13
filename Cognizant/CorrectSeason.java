import
 java.util.Scanner;

public class CorrectSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int season = sc.nextInt();

        if(season < 1 || season >12){
            System.out.println("Invalid Month");
        }
        else if(season >=3 && season <=5){
            System.out.println("Summer");
        }
        else if(season >=6 && season <=11){
            System.out.println("Autumn");
        }else{
            System.out.println("Winter");
        }
    }
}
