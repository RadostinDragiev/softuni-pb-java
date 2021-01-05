package L03_Nested_Conditional_Statements_More_Exercises;

import java.util.Scanner;

public class P01MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budged = Double.parseDouble(scanner.nextLine());
        String ticketType = scanner.nextLine();
        int peopleCount = Integer.parseInt(scanner.nextLine());

        double transportPrice = 0;
        if (peopleCount <= 4) {
            transportPrice = budged - (budged * 0.25);
        } else if (peopleCount <= 9) {
            transportPrice = budged - (budged * 0.4);
        } else if (peopleCount <= 24) {
            transportPrice = budged - (budged * 0.5);
        } else if (peopleCount <= 49) {
            transportPrice = budged - (budged * 0.6);
        } else if (peopleCount >= 50) {
            transportPrice = budged - (budged * 0.75);
        }

        double ticketPrice = 0;
        if (ticketType.equals("VIP")) {
            ticketPrice = 499.99 * peopleCount;
        } else if (ticketType.equals("Normal")) {
            ticketPrice = 249.99 * peopleCount;
        }

        double totalCoast = ticketPrice + transportPrice;
        double difference = 0;
        if (totalCoast < budged) {
            difference = budged - totalCoast;
            System.out.printf("Yes! You have %.2f leva left.", difference);
        } else {
            difference = totalCoast - budged;
            System.out.printf("Not enough money! You need %.2f leva.", difference);
        }
    }
}
