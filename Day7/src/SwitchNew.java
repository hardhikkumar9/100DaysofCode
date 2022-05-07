import java.time.DayOfWeek;
import java.util.Scanner;

public class SwitchNew {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String days = in.next();

        // New Switch case

        switch (days) {
            case "1" -> System.out.println("Monday");
            case "2" -> System.out.println("Tueasday");
            case "3" -> System.out.println("Wednesday");
            case "4" -> System.out.println("Thrushday");
            case "5" -> System.out.println("Friday");
            case "6" -> System.out.println("Saturday");
            case "7" -> System.out.println("Sunday");
        }

            // OLD

        switch (days) {
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
                System.out.println("Weekday");
                break;
            case "6":
            case "7":
                System.out.println("Weekend");
                break;
        }

            //NEW
        switch (days) {
            case "1", "2", "3", "4", "5" -> System.out.println("Weekday");
            case "6", "7" -> System.out.println("Weekend");
        }


    }
}
