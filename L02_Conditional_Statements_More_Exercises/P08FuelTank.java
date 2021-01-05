package L02_Conditional_Statements_More_Exercises;

import java.util.Scanner;

public class P08FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fuel = scanner.nextLine();
        double fuelLiters = Double.parseDouble(scanner.nextLine());

        if (fuel.equals("Diesel") || fuel.equals("Gasoline") || fuel.equals("Gas")) {
            if (fuelLiters >= 25 && fuelLiters <= 55) {
                System.out.printf("You have enough %s.", fuel.toLowerCase());
            } else if (fuelLiters < 25) {
                System.out.printf("Fill your tank with %s!", fuel.toLowerCase());
            }
        } else {
            System.out.println("Invalid fuel!");
        }
    }
}
