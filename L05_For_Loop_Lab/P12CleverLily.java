package L05_For_Loop_Lab;

import java.util.Scanner;

public class P12CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double washingMachine = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        double savedMoney = 0;
        double tempMoney = 0;
        int toyCounter = 0;

        for (int i = 1; i <= age ; i++) {
            if (i % 2 == 0) {
                tempMoney += 10;
                savedMoney += tempMoney;
                savedMoney--;
            } else {
                toyCounter++;
            }
        }

        savedMoney += toyCounter * toyPrice;

        if (savedMoney >= washingMachine) {
            System.out.printf("Yes! %.2f", savedMoney - washingMachine);
        } else {
            System.out.printf("No! %.2f ", washingMachine - savedMoney);
        }
    }
}
