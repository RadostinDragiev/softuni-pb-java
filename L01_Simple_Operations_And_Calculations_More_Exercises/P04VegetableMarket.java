package L01_Simple_Operations_And_Calculations_More_Exercises;

import java.util.Scanner;

public class P04VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceVegetables = Double.parseDouble(scanner.nextLine());
        double priceFruits = Double.parseDouble(scanner.nextLine());
        double totalVegetables = Double.parseDouble(scanner.nextLine());
        double totalFruits = Double.parseDouble(scanner.nextLine());

        double vegetablesIncome = priceVegetables * totalVegetables;
        double fruitsIncome = priceFruits * totalFruits;

        double totalIncomeLeva = vegetablesIncome + fruitsIncome;
        double totalIncomeEuro =  totalIncomeLeva / 1.94;

        System.out.printf("%.2f", totalIncomeEuro);
    }
}
