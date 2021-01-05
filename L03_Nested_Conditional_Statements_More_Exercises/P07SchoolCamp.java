package L03_Nested_Conditional_Statements_More_Exercises;

import java.util.Scanner;

public class P07SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        String groupType = scanner.nextLine();
        int studentsCount = Integer.parseInt(scanner.nextLine());
        int overnight = Integer.parseInt(scanner.nextLine());

        String sport = "";
        double priceForOvernight = 0;

        if (groupType.equals("boys")) {
            switch (season) {
                case "Winter": {
                    sport = "Judo";
                    priceForOvernight = (overnight * 9.6) * studentsCount;
                    break;
                }
                case "Spring": {
                    sport = "Tennis";
                    priceForOvernight = (overnight * 7.2) * studentsCount;
                    break;
                }
                case "Summer": {
                    sport = "Football";
                    priceForOvernight = (overnight * 15) * studentsCount;
                    break;
                }
            }

        } else if (groupType.equals("girls")) {
            switch (season) {
                case "Winter": {
                    sport = "Gymnastics";
                    priceForOvernight = (overnight * 9.6) * studentsCount;
                    break;
                }
                case "Spring": {
                    sport = "Athletics";
                    priceForOvernight = (overnight * 7.2) * studentsCount;
                    break;
                }
                case "Summer": {
                    sport = "Volleyball";
                    priceForOvernight = (overnight * 15) * studentsCount;
                    break;
                }
            }
        } else if (groupType.equals("mixed")) {
            switch (season) {
                case "Winter": {
                    sport = "Ski";
                    priceForOvernight = (overnight * 10) * studentsCount;
                    break;
                }
                case "Spring": {
                    sport = "Cycling";
                    priceForOvernight = (overnight * 9.5) * studentsCount;
                    break;
                }
                case "Summer": {
                    sport = "Swimming";
                    priceForOvernight = (overnight * 20) * studentsCount;
                    break;
                }
            }
        }

        double discount = 0;
        if (studentsCount >= 10 && studentsCount < 20) {
            discount = priceForOvernight * 0.05;
        } else if (studentsCount >= 20 && studentsCount < 50) {
            discount = priceForOvernight * 0.15;
        } else if (studentsCount >= 50) {
            discount = priceForOvernight * 0.5;
        }

        double priceAfterDiscount = priceForOvernight - discount;

        System.out.printf("%s %.2f lv.", sport, priceAfterDiscount);
    }
}
