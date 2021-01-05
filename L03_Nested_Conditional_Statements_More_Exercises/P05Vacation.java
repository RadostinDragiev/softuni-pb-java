package L03_Nested_Conditional_Statements_More_Exercises;

import java.util.Scanner;

public class P05Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budged = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String location = "";
        String placeToSleep = "";
        double price = 0;

        if (budged <= 1000) {
            placeToSleep = "Camp";
            switch (season) {
                case "Summer": {
                    location = "Alaska";
                    price = budged * 0.65;
                    break;
                }
                case "Winter": {
                    location = "Morocco";
                    price = budged * 0.45;
                    break;
                }
            }
        } else if (budged <= 3000) {
            placeToSleep = "Hut";
            switch (season) {
                case "Summer": {
                    location = "Alaska";
                    price = budged * 0.80;
                    break;
                }
                case "Winter": {
                    location = "Morocco";
                    price = budged * 0.60;
                    break;
                }
            }
        } else if (budged > 3000) {
            placeToSleep = "Hotel";
            price = budged * 0.90;
            switch (season) {
                case "Summer": {
                    location = "Alaska";
                    break;
                }
                case "Winter": {
                    location = "Morocco";
                    break;
                }
            }
        }

        System.out.printf("%s - %s - %.2f", location, placeToSleep, price);
    }
}
