package L03_Nested_Conditional_Statements_Exercise;

import java.util.Scanner;

public class P09OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examHour = Integer.parseInt(scanner.nextLine()) * 60;
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arriveHour = Integer.parseInt(scanner.nextLine()) * 60;
        int arriveMinutes = Integer.parseInt(scanner.nextLine());

        int examTimeInMinutes = examHour + examMinutes;
        int arriveTimeInMinutes = arriveHour + arriveMinutes;

        int difference = examTimeInMinutes - arriveTimeInMinutes;
        int hours = Math.abs(difference) / 60;
        int minutes = Math.abs(difference) % 60;
        if (difference < 0) {
            System.out.println("Late");
            if (Math.abs(difference) >= 60) {
                if (minutes < 10) {
                    System.out.printf("%d:0%d hours after the start", hours, minutes);
                } else {
                    System.out.printf("%d:%d hours after the start", hours, minutes);
                }
            } else {
                System.out.printf("%d minutes after the start", minutes);
            }
        } else if (difference >= 0 && difference <= 30) {
            if (difference ==0) {
                System.out.println("On time");
            } else {
                System.out.println("On time");
                System.out.printf("%d minutes before the start", minutes);
            }
        } else {
            System.out.println("Early");
            if (difference >= 60) {
                if (minutes < 10) {
                    System.out.printf("%d:0%d hours before the start", hours, minutes);
                } else {
                    System.out.printf("%d:%d hours before the start", hours, minutes);
                }
            } else {
                System.out.printf("%d minutes before the start", minutes);
            }
        }
    }
}
