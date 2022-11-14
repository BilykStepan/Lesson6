import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {
        String[] weekDay = new String[7];
        weekDay[0] = "Monday";
        weekDay[1] = "Tuesday";
        weekDay[2] = "Wednesday";
        weekDay[3] = "Thursday";
        weekDay[4] = "Friday";
        weekDay[5] = "Saturday";
        weekDay[6] = "Sunday";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of attempts:");
        int attempt = input.nextInt();
        for (int i = 0; i < weekDay.length; i++) {
            System.out.println("Enter the day of the week");
            int dayNumber = input.nextInt();
            switch (dayNumber) {
                case 1 -> System.out.println(weekDay[0]);
                case 2 -> System.out.println(weekDay[1]);
                case 3 -> System.out.println(weekDay[2]);
                case 4 -> System.out.println(weekDay[3]);
                case 5 -> System.out.println(weekDay[4]);
                case 6 -> System.out.println(weekDay[5]);
                case 7 -> System.out.println(weekDay[6]);
                default -> System.out.println("There are no such day.");
            }
        }
    }
}
