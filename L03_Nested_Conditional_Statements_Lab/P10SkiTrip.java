package L03_Nested_Conditional_Statements_Lab;

import java.util.Scanner;

public class P10SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String feedback = scanner.nextLine();

        double price = 0;
        double discount = 0;

        if (roomType.equals("apartment")) {
            price = (days - 1) * 25;
            if (days < 10) {
                discount = price * 0.30;
            } else if ( days >= 10 && days <= 15) {
                discount = price * 0.35;
            } else {
                discount = price * 0.5;
            }
            price = price - discount;
        } else if (roomType.equals("president apartment")) {
            price = (days - 1) * 35;
            if (days < 10) {
                discount = price * 0.1;
            } else if (days >= 10 && days <= 15) {
                discount = price * 0.15;
            } else {
                discount = price * 0.2;
            }
            price = price - discount;
        } else {
            price = (days - 1) * 18;
        }

        if (feedback.equals("positive")) {
            price *= 1.25;
        } else {
            price *= 0.9;
        }

        System.out.printf("%.02f", price);
    }
}
