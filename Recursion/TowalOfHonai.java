public class TowalOfHonai {
    public static void main(String[] args) {
        int n = 3; 
        int totalMoves = recurTowel(n,'S','H','D');
        System.out.println("Total moves: " + totalMoves);
    }

    public static int recurTowel(int n, char source, char helper, char destination) {
        if(n == 0) {
            return 0;
        }
        int moves = 0;

        moves += recurTowel(n-1, source, destination, helper);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        moves += 1;
        moves += recurTowel(n-1, helper, source, destination);
        return moves;
    }
}
