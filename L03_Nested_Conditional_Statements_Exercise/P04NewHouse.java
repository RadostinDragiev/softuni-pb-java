package L03_Nested_Conditional_Statements_Exercise;

import java.util.Scanner;

public class P04NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowersType = scanner.nextLine();
        int flowersCount = Integer.parseInt(scanner.nextLine());
        int budged = Integer.parseInt(scanner.nextLine());

        double price = 0;
        double discount = 0;
        double higherPrice = 0;

        switch (flowersType) {
            case "Roses": {
                price = flowersCount * 5;
                break;
            }
            case "Dahlias": {
                price = flowersCount * 3.8;
                break;
            }
            case "Tulips": {
                price = flowersCount * 2.8;
                break;
            }
            case "Narcissus": {
                price = flowersCount * 3;
                break;
            }
            case "Gladiolus": {
                price = flowersCount * 2.5;
                break;
            }
        }

        if (flowersType.equals("Roses") && flowersCount > 80){
            discount = price * 0.10;
        } else if (flowersType.equals("Dahlias") && flowersCount > 90) {
            discount = price * 0.15;
        } else if (flowersType.equals("Tulips") && flowersCount > 80) {
            discount = price * 0.15;
        } else if (flowersType.equals("Narcissus") && flowersCount < 120) {
            higherPrice = price * 0.15;
        } else if (flowersType.equals("Gladiolus") && flowersCount < 80){
            higherPrice = price * 0.20;
        }

        double finalPrice = price - discount + higherPrice;

        if (finalPrice <= budged ) {
            double difference = budged - finalPrice;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",flowersCount, flowersType,
                    difference);
        } else {
            double difference = finalPrice - budged;
            System.out.printf("Not enough money, you need %.2f leva more.", difference);
        }
    }
}
