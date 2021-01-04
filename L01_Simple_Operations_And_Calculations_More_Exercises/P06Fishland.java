package L01_Simple_Operations_And_Calculations_More_Exercises;

import java.util.Scanner;

public class P06Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mackerelPrice = Double.parseDouble(scanner.nextLine());
        double spratPrice = Double.parseDouble(scanner.nextLine());
        double palmQuantity = Double.parseDouble(scanner.nextLine());
        double scadQuantity = Double.parseDouble(scanner.nextLine());
        double musselsQuantity = Double.parseDouble(scanner.nextLine());

        double palmPrice = mackerelPrice * 0.6 + mackerelPrice;
        double scadPrice = spratPrice * 0.8 + spratPrice;
        double musselsPrice = 7.5;

        double totalAmaount = palmPrice * palmQuantity + scadPrice * scadQuantity + musselsPrice * musselsQuantity;

        System.out.printf("%.2f", totalAmaount);
    }
}
