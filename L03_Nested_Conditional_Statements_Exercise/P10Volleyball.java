package L03_Nested_Conditional_Statements_Exercise;

import java.util.Scanner;

public class P10Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String year = scanner.nextLine();
        double holidays = Double.parseDouble(scanner.nextLine());
        double weekends = Double.parseDouble(scanner.nextLine());

        double weekendSofia = (48 - weekends) * (3.0 / 4.0);
        double holidaysPlay = holidays * (2.0 / 3.0);
        double playedDays = weekendSofia + holidaysPlay + weekends;

        if ("leap".equalsIgnoreCase(year)) {
            holidaysPlay = playedDays + playedDays * 0.15;
            System.out.printf("%f",Math.floor(holidaysPlay));
        } else if ("normal".equalsIgnoreCase(year)) {
            System.out.printf("%f", Math.floor(playedDays));
        }
    }
}
