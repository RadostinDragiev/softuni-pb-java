package L03_Nested_Conditional_Statements_Lab;

import java.util.Scanner;

public class P08FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double price = 0;
        boolean isError = false;

//      (Monday / Tuesday / Wednesday / Thursday / Friday //Saturday / Sunday)
//      (banana / apple / orange / grapefruit / kiwi / pineapple / grapes)
        if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday")
                || day.equals("Friday")) {
            switch (fruit) {
                case "banana": price = quantity * 2.5; break;
                case "apple": price = quantity * 1.2; break;
                case "orange": price = quantity * 0.85; break;
                case "grapefruit": price = quantity * 1.45; break;
                case "kiwi": price = quantity * 2.7; break;
                case "pineapple": price = quantity * 5.5; break;
                case "grapes": price = quantity * 3.85; break;
                default: isError = true; break;
            }

        } else if (day.equals("Saturday") || day.equals("Sunday")) {
            switch (fruit) {
                case "banana": price = quantity * 2.7; break;
                case "apple": price = quantity * 1.25; break;
                case "orange": price = quantity * 0.90; break;
                case "grapefruit": price = quantity * 1.60; break;
                case "kiwi": price = quantity * 3; break;
                case "pineapple": price = quantity * 5.6; break;
                case "grapes": price = quantity * 4.20; break;
                default: isError = true; break;
            }
        } else {
            isError = true;
        }
        if (isError) {
            System.out.println("error");
        } else {
            System.out.printf("%.2f", price);
        }
    }
}
