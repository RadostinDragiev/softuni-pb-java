package L01_Simple_Operations_And_Calculations_Exercise;

import java.util.Scanner;

public class P03RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());

        double lenght = Math.abs(x1 - x2);
        double wight = Math.abs(y1 - y2);

        double area = lenght * wight;
        double perimeter = 2 * (lenght + wight);

        System.out.printf("%.2f %n", area);
        System.out.printf("%.2f", perimeter);
    }
}
