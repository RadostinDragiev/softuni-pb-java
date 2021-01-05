package L04_While_Loop_Exercise;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vacationPrice = Double.parseDouble(scanner.nextLine());
        double amaountAvailable = Double.parseDouble(scanner.nextLine());

        int spendCounter = 0;
        int daysCounter = 0;
        while (!(vacationPrice <= amaountAvailable)) {
            String saveOrSpend = scanner.nextLine();
            double amountSaveOrSpend = Double.parseDouble(scanner.nextLine());
            if (saveOrSpend.equals("save")) {
                amaountAvailable += amountSaveOrSpend;
                spendCounter = 0;
            }
            if (saveOrSpend.equals("spend")) {
                amaountAvailable -= amountSaveOrSpend;
                spendCounter++;
                if (amaountAvailable < 0) {
                    amaountAvailable = 0;
                }
            }
            daysCounter++;
            if (spendCounter == 5) {
                break;
            }
        }
        if (vacationPrice <= amaountAvailable) {
            System.out.printf("You saved the money for %d days.", daysCounter);
        }
        if (spendCounter == 5) {
            System.out.println("You can't save the money.");
            System.out.printf("%d", daysCounter);
        }
    }
}
