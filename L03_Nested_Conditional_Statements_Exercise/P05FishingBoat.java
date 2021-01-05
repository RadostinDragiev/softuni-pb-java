package L03_Nested_Conditional_Statements_Exercise;

import java.util.Scanner;

public class P05FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budged = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermans = Integer.parseInt(scanner.nextLine());

        double boatPrice = 0;
        double isOdd = fishermans % 2;

        switch (season) {
            case "Spring": {
                boatPrice = 3000;
                break;
            }
            case "Summer":
            case "Autumn": {
                boatPrice = 4200;
                break;
            }
            case "Winter": {
                boatPrice = 2600;
                break;
            }
        }

        if (fishermans <= 6) {
            boatPrice = boatPrice - (boatPrice * 0.1);
        } else if (fishermans <= 11) {
            boatPrice = boatPrice - (boatPrice * 0.15);
        } else if (fishermans > 11) {
            boatPrice = boatPrice - (boatPrice * 0.25);
        }

        if (!season.equals("Autumn") && isOdd == 0) {
            boatPrice = boatPrice - (boatPrice * 0.05);
        }

        double difference = 0;

        if (boatPrice <= budged) {
            difference = budged - boatPrice;
            System.out.printf("Yes! You have %.2f leva left.", difference);
        } else if (boatPrice > budged) {
            difference = boatPrice - budged;
            System.out.printf("Not enough money! You need %.2f leva.", difference);
        }
    }
}
