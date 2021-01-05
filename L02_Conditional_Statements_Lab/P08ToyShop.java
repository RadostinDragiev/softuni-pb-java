package L02_Conditional_Statements_Lab;

import java.util.Scanner;

public class P08ToyShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double excursion = Double.parseDouble(scanner.nextLine());
        int puzzle = Integer.parseInt(scanner.nextLine());
        int talkingDoll = Integer.parseInt(scanner.nextLine());
        int teddyBear = Integer.parseInt(scanner.nextLine());
        int minion = Integer.parseInt(scanner.nextLine());
        int truck = Integer.parseInt(scanner.nextLine());

        double price = puzzle * 2.6 + talkingDoll * 3 + teddyBear * 4.1 + minion * 8.2 + truck * 2;

        int totalToys = puzzle + talkingDoll + teddyBear +  minion + truck;

        if (totalToys >= 50) {
            price = price - price * 0.25;
        }

        double totalMoney = price - price * 0.1;
        double difference = Math.abs(excursion - totalMoney);

        if (totalMoney >= excursion) {
            System.out.printf("Yes! %.2f lv left.", difference);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", difference);
        }
    }

}
