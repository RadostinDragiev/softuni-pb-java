package L02_Conditional_Statements_More_Exercises;

import java.util.Scanner;

public class P09FuelTankPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fuel = scanner.nextLine();
        double fuelLiters = Double.parseDouble(scanner.nextLine());
        String discountCard = scanner.nextLine();

        double fuelPrice = 0;

        if (fuel.equals("Gas")) {
            fuelPrice = 0.93;
            if (discountCard.equals("Yes")) {
                fuelPrice -= 0.08;
            }
        } else if (fuel.equals("Gasoline")) {
            fuelPrice = 2.22;
            if (discountCard.equals("Yes")) {
                fuelPrice -= 0.18;
            }
        } else if (fuel.equals("Diesel")) {
            fuelPrice = 2.33;
            if (discountCard.equals("Yes")) {
                fuelPrice -= 0.12;
            }
        }

        if (fuelLiters >= 20 && fuelLiters <= 25) {
            fuelPrice *= 0.92;
        } else if (fuelLiters > 25) {
            fuelPrice *= 0.90;
        }

        System.out.printf("%.2f lv.", fuelPrice * fuelLiters);
    }
}
