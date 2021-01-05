package L02_Conditional_Statements_Exercise;

import java.util.Scanner;

public class P08Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double income = Double.parseDouble(scanner.nextLine());
        double grades = Double.parseDouble(scanner.nextLine());
        double averageSalary = Double.parseDouble(scanner.nextLine());

        double socialScollarship = Math.floor(averageSalary * 0.35);
        double scollarshipForExcellentResult = Math.floor(grades * 25);

        if (grades > 4.5 && socialScollarship > scollarshipForExcellentResult && income < averageSalary) {
            System.out.printf("You get a Social scholarship %.0f BGN", socialScollarship);
        } else if (grades > 5.5 && scollarshipForExcellentResult >= socialScollarship) {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", scollarshipForExcellentResult);
        } else {
            System.out.println("You cannot get a scholarship!");
        }

    }
}
