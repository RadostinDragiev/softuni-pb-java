package L03_Nested_Conditional_Statements_More_Exercises;

import java.util.Scanner;

public class P04CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budged = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String carClass = "";
        String carType = "";
        double carPrice = 0;

        if (budged <= 100) {
            carClass = "Economy class";
            switch (season) {
                case "Summer": {
                    carType = "Cabrio";
                    carPrice = budged * 0.35;
                    break;
                }
                case "Winter": {
                    carType = "Jeep";
                    carPrice = budged * 0.65;
                    break;
                }
            }
        } else if (budged <= 500) {
            carClass = "Compact class";
            switch (season) {
                case "Summer": {
                    carType = "Cabrio";
                    carPrice = budged * 0.45;
                    break;
                }
                case "Winter": {
                    carType = "Jeep";
                    carPrice = budged * 0.80;
                    break;
                }
            }
        } else if (budged > 500) {
            carClass = "Luxury class";
            carType = "Jeep";
            carPrice = budged * 0.90;
        }

        System.out.printf("%s%n", carClass);
        System.out.printf("%s - %.2f", carType, carPrice);
    }
}
