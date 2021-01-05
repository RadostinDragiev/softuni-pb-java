package L02_Conditional_Statements_More_Exercises;

import java.util.Scanner;

public class P07FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int magnolia = Integer.parseInt(scanner.nextLine());
        int hyacinths = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int cactus = Integer.parseInt(scanner.nextLine());
        double presentPrice = Double.parseDouble(scanner.nextLine());

        double income = (magnolia * 3.25) + (hyacinths * 4) + (roses * 3.5) + (cactus * 8);
        double incomeWithoutTaxes = income - (income * 0.05);

        if (incomeWithoutTaxes >= presentPrice) {
            double moneyLeft = Math.floor(incomeWithoutTaxes - presentPrice);
            System.out.printf("She is left with %.0f leva.", moneyLeft);
        } else {
            double moneyNeeded = Math.ceil(presentPrice - incomeWithoutTaxes);
            System.out.printf("She will have to borrow %.0f leva.", moneyNeeded);
        }
    }
}
