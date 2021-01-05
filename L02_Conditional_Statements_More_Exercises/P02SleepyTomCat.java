package L02_Conditional_Statements_More_Exercises;

import java.util.Scanner;

public class P02SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysOff = Integer.parseInt(scanner.nextLine());

        int workingDays = 365 - daysOff;
        int minutesPerDayOff = daysOff * 127;
        int minutesPerWorkingDay = workingDays *63;
        int minutesPerYear = minutesPerDayOff + minutesPerWorkingDay;
        int minutesHeCanPlay = 30000;

        if (minutesPerYear >= minutesHeCanPlay) {
            int overTheLimit = minutesPerYear - minutesHeCanPlay;
            int hours = overTheLimit / 60;
            int minutes = overTheLimit % 60;
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %02d minutes more for play", hours, minutes);
        } else {
            int underTheLimit = minutesHeCanPlay - minutesPerYear;
            int hours = underTheLimit / 60;
            int minutes = underTheLimit % 60;
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %02d minutes less for play", hours, minutes);
        }
    }
}
