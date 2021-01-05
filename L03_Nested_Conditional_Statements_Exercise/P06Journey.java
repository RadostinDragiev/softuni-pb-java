package L03_Nested_Conditional_Statements_Exercise;

import java.util.Scanner;

public class P06Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budged = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        String vacationType = "";
        double vacationPrice = 0;

        if (budged <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                vacationPrice = budged * 0.3;
                vacationType = "Camp";
            } else if (season.equals("winter")) {
                vacationPrice = budged * 0.7;
                vacationType = "Hotel";
            }
        } else if (budged <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                vacationPrice = budged * 0.4;
                vacationType = "Camp";
            } else if (season.equals("winter")) {
                vacationPrice = budged * 0.8;
                vacationType = "Hotel";
            }
        } else if (budged > 1000) {
            destination = "Europe";
            vacationPrice = budged * 0.9;
            vacationType = "Hotel";
        }

        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", vacationType, vacationPrice);
    }
}
