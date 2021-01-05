package L02_Conditional_Statements_Exercise;

import java.util.Scanner;

public class P09ScholarshipV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double income = Double.parseDouble(scanner.nextLine());
        double grades = Double.parseDouble(scanner.nextLine());
        double minimalSalary = Double.parseDouble(scanner.nextLine());

        boolean socialScolarship = false;
        double socialScollarshipAmount = 0;
        if (income < minimalSalary && grades > 4.5) {
            socialScolarship = true;
            socialScollarshipAmount = Math.floor(minimalSalary * 0.35);
        }

        boolean exellentResultScolarship = false;
        double exellentResultScolarshipAmount = 0;
        if (grades >= 5.5) {
            exellentResultScolarship = true;
            exellentResultScolarshipAmount = Math.floor(grades * 25);
        }

        if (socialScolarship && !exellentResultScolarship) {
            System.out.printf("You get a Social scholarship %.0f BGN", socialScollarshipAmount);
        } else if (!socialScolarship && exellentResultScolarship) {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", exellentResultScolarshipAmount);
        } else if (socialScolarship && exellentResultScolarship) {
            if (socialScollarshipAmount > exellentResultScolarshipAmount) {
                System.out.printf("You get a Social scholarship %.0f BGN", socialScollarshipAmount);
            } else {
                System.out.printf("You get a scholarship for excellent results %.0f BGN", exellentResultScolarshipAmount);
            }
        } else {
            System.out.println("You cannot get a scholarship!");
        }
    }
}
