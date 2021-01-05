package L04_While_Loop_Lab;

import java.util.Scanner;

public class P04AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int transactionCount = Integer.parseInt(scanner.nextLine());
        int count = 0;
        double balance = 0;

        while (count < transactionCount) {
            double amountOfIncome = Double.parseDouble(scanner.nextLine());
            if (amountOfIncome < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            balance += amountOfIncome;
            System.out.printf("Increase: %.2f%n", amountOfIncome);
            count++;
        }

        System.out.printf("Total: %.2f", balance);
    }
}
