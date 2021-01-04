package L01_Simple_Operations_And_Calculations_More_Exercises;

import java.util.Scanner;

public class P03CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double celsius = Double.parseDouble(scanner.nextLine());
        double celsiusToFarenheit = celsius * 1.8 + 32;

        System.out.printf("%.2f", celsiusToFarenheit);
    }
}
