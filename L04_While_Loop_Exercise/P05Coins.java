package L04_While_Loop_Exercise;

import java.util.Scanner;

public class P05Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount = Double.parseDouble(scanner.nextLine());

        amount = Math.floor(amount * 100);
        int coins = 0;
        while (amount > 0) {
            if (amount >= 200) {
                coins++;
                amount -= 200;
            } else if (amount >= 100) {
                coins++;
                amount -= 100;
            } else if (amount >= 50) {
                coins++;
                amount -= 50;
            } else if (amount >= 20) {
                coins++;
                amount -= 20;
            } else if (amount >= 10) {
                coins++;
                amount -= 10;
            } else if (amount >= 5) {
                coins++;
                amount -= 5;
            } else if (amount >= 2) {
                coins++;
                amount -= 2;
            } else if (amount >= 1){
                coins++;
                amount -= 1;
            }
        }
        System.out.printf("%d",coins);
    }
}
