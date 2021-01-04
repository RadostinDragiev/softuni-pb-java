package L01_Simple_Operations_And_Calculations_Exercise;

import java.util.Scanner;

public class P07AlcoholMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double wiskeyPrice = Double.parseDouble(scanner.nextLine());
        double beerLiters = Double.parseDouble(scanner.nextLine());
        double wineLiters = Double.parseDouble(scanner.nextLine());
        double rakiaLiters = Double.parseDouble(scanner.nextLine());
        double wiskeyLiters = Double.parseDouble(scanner.nextLine());

        double rakiaPrice = wiskeyPrice - (0.5 * wiskeyPrice);
        double winePrice = rakiaPrice - (0.4 * rakiaPrice);
        double beerPrice = rakiaPrice - (0.8 * rakiaPrice);

        double wiskeyTotal = wiskeyLiters * wiskeyPrice;
        double beerTotal = beerLiters * beerPrice;
        double wineTotal = wineLiters * winePrice;
        double rakiaTotal = rakiaLiters * rakiaPrice;

        double finalPrice= wiskeyTotal + beerTotal + wineTotal + rakiaTotal;

        System.out.printf("%.2f",finalPrice);
    }
}
