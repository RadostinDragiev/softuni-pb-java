package L03_Nested_Conditional_Statements_More_Exercises;

import java.util.Scanner;

public class P06TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        double kmPerMonth = Double.parseDouble(scanner.nextLine());

        double salary = 0;

        if (kmPerMonth <= 5000) {
            switch (season) {
                case "Autumn": {}
                case "Spring": {
                    salary = (kmPerMonth * 0.75) * 4;
                    break;
                }
                case "Summer": {
                    salary = (kmPerMonth * 0.90) * 4;
                    break;
                }
                case "Winter": {
                    salary = (kmPerMonth * 1.05) * 4;
                    break;
                }
            }
        } else if (kmPerMonth <= 10000) {
            switch (season) {
                case "Autumn": {}
                case "Spring": {
                    salary = (kmPerMonth * 0.95) * 4;
                    break;
                }
                case "Summer": {
                    salary = (kmPerMonth * 1.10) * 4;
                    break;}
                case "Winter": {
                    salary = (kmPerMonth * 1.25) * 4;
                    break;
                }
            }
        } else if (kmPerMonth <= 20000) {
            salary = (kmPerMonth * 1.45) * 4;
        }

        double salaryAfterTaxes = salary * 0.9;

        System.out.printf("%.2f", salaryAfterTaxes);
    }
}
