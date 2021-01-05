package L04_While_Loop_More_Exercises;

import java.util.Scanner;

public class P02ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = Integer.parseInt(scanner.nextLine());

        int collectedMoneyByCard = 0;
        int collectedMoneyByCash = 0;
        int cashOrCard = 0;
        double paymentByCash = 0;
        double paymentByCard = 0;
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            int itemsPrice = Integer.parseInt(input);

            if (cashOrCard == 1) {
                if (itemsPrice < 10) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    collectedMoneyByCard += itemsPrice;
                    paymentByCard++;
                }
                cashOrCard = 0;
            } else {
                if (itemsPrice > 100) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    collectedMoneyByCash += itemsPrice;
                    paymentByCash++;
                }
                cashOrCard++;
            }
            if (collectedMoneyByCard + collectedMoneyByCash >= target) {
                break;
            }
            input = scanner.nextLine();
        }

        if (input.equals("End")) {
            System.out.println("Failed to collect required money for charity.");
        } else {
            System.out.printf("Average CS: %.2f%n", collectedMoneyByCash / paymentByCash);
            System.out.printf("Average CC: %.2f", collectedMoneyByCard / paymentByCard);
        }
    }
}
