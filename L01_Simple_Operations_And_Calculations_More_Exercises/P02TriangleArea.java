package L01_Simple_Operations_And_Calculations_More_Exercises;

import java.util.Scanner;

public class P02TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sideA = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        double area = sideA * height / 2;

        System.out.printf("%.2f", area);
    }
}
