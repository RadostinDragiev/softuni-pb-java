package L05_For_Loop_Exercise;

import java.util.Scanner;

public class P06Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tabsOpened = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < tabsOpened; i++) {
            String siteName = scanner.nextLine();

            if (siteName.equals("Facebook")) {
                salary -= 150;
            } else if (siteName.equals("Instagram")) {
                salary -= 100;
            }else if (siteName.equals("Reddit")) {
                salary -= 50;
            }

            if (salary <= 0) {
                break;
            }
        }

        if (salary <= 0) {
            System.out.println("You have lost your salary.");
        } else {
            System.out.println(salary);
        }
    }
}
