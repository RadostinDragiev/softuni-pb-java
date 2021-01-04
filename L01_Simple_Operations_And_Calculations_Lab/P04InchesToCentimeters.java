package L01_Simple_Operations_And_Calculations_Lab;

import java.util.Scanner;

public class P04InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double inches = Double.parseDouble(scanner.nextLine());
        Double centimeters = inches * 2.54;
        System.out.printf("%.2f", centimeters);
    }
}
