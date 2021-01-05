package L05_For_Loop_More_Exercises;

import java.util.Scanner;

public class P01BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double heritageMoney = Double.parseDouble(scanner.nextLine());
        int untilThisyear = Integer.parseInt(scanner.nextLine());

        int yearsHeStay = 0;

        for (int year = 1800; year <= untilThisyear; year++) {

            if (year % 2 == 0) {
                heritageMoney -= 12000;
            } else {
                heritageMoney -= 12000 + 50 * (18 + yearsHeStay);
            }

            yearsHeStay++;
        }

        if (heritageMoney >= 0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", heritageMoney);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(heritageMoney));
        }
    }
}
