package L01_Simple_Operations_And_Calculations_Exercise;

import java.util.Scanner;

public class P01USDtoBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double usd = Double.parseDouble(scanner.nextLine());
        double bgn = usd * 1.79549;
        System.out.printf("%.2f",bgn);
    }
}
