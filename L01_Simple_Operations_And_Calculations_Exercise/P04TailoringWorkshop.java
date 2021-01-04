package L01_Simple_Operations_And_Calculations_Exercise;

import java.util.Scanner;

public class P04TailoringWorkshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tables = Integer.parseInt(scanner.nextLine());
        double lenght = Double.parseDouble(scanner.nextLine());
        double  wight = Double.parseDouble(scanner.nextLine());

        double tablecloths = tables * (lenght + 2 * 0.30) * (wight + 2 *0.30);
        double square = tables * (lenght / 2) * ( lenght / 2);

        double dollarsPrice = tablecloths * 7 + square * 9;
        double levaPrice = dollarsPrice * 1.85;

        System.out.printf("%.2f USD %n", dollarsPrice);
        System.out.printf("%.2f BGN", levaPrice);

    }
}
