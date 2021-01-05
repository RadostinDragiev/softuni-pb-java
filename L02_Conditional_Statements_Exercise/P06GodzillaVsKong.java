package L02_Conditional_Statements_Exercise;

import java.util.Scanner;

public class P06GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budged = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double pricePerDress = Double.parseDouble(scanner.nextLine());

        double decorPrice = budged / 10 ;

        double priceForDresses = statists * pricePerDress;

        if (statists >= 150) {
            priceForDresses *= 0.9;
        }

        double totalCoasts = decorPrice + priceForDresses;
        double plusOrMinus = budged - totalCoasts;
        double minusOrPlus = totalCoasts - budged;

        if (totalCoasts > budged) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", minusOrPlus);
        }
        else if (totalCoasts <= budged) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", plusOrMinus);
        }
    }
}
