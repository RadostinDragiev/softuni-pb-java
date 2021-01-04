package L01_Simple_Operations_And_Calculations_Exercise;

import java.util.Scanner;

public class P06CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int bakers = Integer.parseInt(scanner.nextLine());
        int cakes = Integer.parseInt(scanner.nextLine());
        int waffles = Integer.parseInt(scanner.nextLine());
        int pancakes = Integer.parseInt(scanner.nextLine());

        double incomeFromCakes = cakes * 45;
        double incomeFromWaffles = waffles * 5.80;
        double incomeFromPanckes = pancakes * 3.20;

        double bakersMoney = bakers * (incomeFromCakes + incomeFromWaffles + incomeFromPanckes);
        double totalAmount = bakersMoney * days;

        double finalAmount = totalAmount - (totalAmount * 1/8);

        System.out.printf("%.2f", finalAmount);
    }
}
