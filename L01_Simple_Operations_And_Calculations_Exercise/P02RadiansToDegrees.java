package L01_Simple_Operations_And_Calculations_Exercise;

import java.util.Scanner;

public class P02RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rad = Double.parseDouble(scanner.nextLine());
        double deg = rad * 180/ Math.PI;
        System.out.printf("%.0f", deg);
    }
}
