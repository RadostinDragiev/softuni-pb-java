package L05_For_Loop_More_Exercises;

import java.util.Scanner;

public class P06Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int months = Integer.parseInt(scanner.nextLine());

        double electricity = 0;
        double water = 20 * months;
        double internet = 15 * months;
        double other = 0;

        for (int i = 0; i < months; i++) {
            double electricityBill = Double.parseDouble(scanner.nextLine());

            electricity += electricityBill;
            other += ((electricityBill + 20 + 15) * 1.20);
        }

        System.out.printf("Electricity: %.2f lv%n", electricity);
        System.out.printf("Water: %.2f lv%n", water);
        System.out.printf("Internet: %.2f lv%n", internet);
        System.out.printf("Other: %.2f lv%n", other);
        System.out.printf("Average: %.2f lv", (electricity + water + internet + other) / months);
    }
}
