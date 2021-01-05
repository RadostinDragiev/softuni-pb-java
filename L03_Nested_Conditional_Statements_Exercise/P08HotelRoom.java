package L03_Nested_Conditional_Statements_Exercise;

import java.util.Scanner;

public class P08HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        double apartmentPrice = 0;
        double studioPrice = 0;

        if (month.equals("May") || month.equals("October")) {
            apartmentPrice = 65 * days;
            studioPrice = 50 * days;
            if (days > 7 & days <= 13) {
                studioPrice = studioPrice - (studioPrice * 0.05);
            } else if (days > 14) {
                studioPrice = studioPrice - (studioPrice * 0.3);
            }
        } else if (month.equals("June") || month.equals("September")) {
            apartmentPrice = 68.70 * days;
            studioPrice = 75.20 * days;
            if (days > 14) {
                studioPrice = studioPrice - (studioPrice * 0.20);
            }
        } else if (month.equals("July") || month.equals("August")) {
            apartmentPrice = 77 * days;
            studioPrice = 76 * days;
        }

        if (days > 14) {
            apartmentPrice = apartmentPrice - (apartmentPrice * 0.1);
        }

        System.out.printf("Apartment: %.2f lv.%n", apartmentPrice);
        System.out.printf("Studio: %.2f lv.", studioPrice);
    }
}
