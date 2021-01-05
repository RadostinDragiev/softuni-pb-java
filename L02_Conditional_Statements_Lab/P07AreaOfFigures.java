package L02_Conditional_Statements_Lab;

import java.util.Scanner;

public class P07AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        double area = 0.0;

        switch (type) {
            case "square": {
                double a = Double.parseDouble(scanner.nextLine());
                area = a * a;
                System.out.printf("%.3f", area);
                break;
            }
            case "rectangle": {
                double a = Double.parseDouble(scanner.nextLine());
                double b = Double.parseDouble(scanner.nextLine());
                area = a * b;
                System.out.printf("%.3f", area);
                break;
            }
            case "circle": {
                double r = Double.parseDouble(scanner.nextLine());
                area = Math.PI * Math.pow(r,2);
                System.out.printf("%.3f", area);
                break;
            }
            case "triangle": {
                double a = Double.parseDouble(scanner.nextLine());
                double h = Double.parseDouble(scanner.nextLine());
                area = (a * h) / 2;
                System.out.printf("%.3f", area);
                break;
            }
            default:
                System.out.println("Error!");
                break;
        }
    }
}
