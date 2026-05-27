import java.util.ArrayList;
import java.util.List;

public class Question3 {
    List<String> result = new ArrayList<>();

    public List<String> readBinaryWatch(int turnedOn) {

        // clear previous results
        result.clear();

        // LEDs values
        int[] hours = {8, 4, 2, 1};
        int[] minutes = {32, 16, 8, 4, 2, 1};

        backtrack(turnedOn, 0, 0, 0, hours, minutes);

        return result;
    }

    public void backtrack(int ledsLeft, int index,
                          int hour, int minute,
                          int[] hours, int[] minutes) {

        // Invalid time
        if (hour > 11 || minute > 59) {
            return;
        }

        // Required LEDs selected
        if (ledsLeft == 0) {
            result.add(hour + ":" + String.format("%02d", minute));
            return;
        }

        // All LEDs processed
        if (index == 10) {
            return;
        }

        // Choose current LED
        if (index < 4) {
            backtrack(ledsLeft - 1, index + 1,
                      hour + hours[index], minute,
                      hours, minutes);
        } else {
            backtrack(ledsLeft - 1, index + 1,
                      hour,
                      minute + minutes[index - 4],
                      hours, minutes);
        }

        // Skip current LED
        backtrack(ledsLeft, index + 1,
                  hour, minute,
                  hours, minutes);
    }

    public static void main(String[] args) {
        Question3 q = new Question3();

        int[] tests = {0, 1, 2, 3};
        for (int t : tests) {
            java.util.List<String> out = q.readBinaryWatch(t);
            System.out.println("turnedOn=" + t + " -> count=" + out.size());
            for (String s : out) System.out.println(s);
            System.out.println();
        }
    }
}
