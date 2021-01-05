package L02_Conditional_Statements_More_Exercises;

import java.util.Scanner;

public class P04TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kilometers = Integer.parseInt(scanner.nextLine());
        String dayOrNight = scanner.nextLine();

        double price = 0.0;

        double taxiCoast = 0.7;
        if (dayOrNight.equalsIgnoreCase("day")) {
            taxiCoast += kilometers * 0.79;
        } else if (dayOrNight.equalsIgnoreCase("night")) {
            taxiCoast += kilometers * 0.9;
        }

        double busCoast = kilometers * 0.09;
        double trainCoast = kilometers * 0.06;

        if (kilometers < 20) {
            price = taxiCoast;
        } else if (kilometers >= 20 && kilometers < 100) {
            price = busCoast;
        } else {
            price = trainCoast;
        }

        System.out.printf("%.2f", price);

    }
}
