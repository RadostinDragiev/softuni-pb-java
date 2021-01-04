package L01_Simple_Operations_And_Calculations_Exercise;

import java.util.Scanner;

public class P05DanceHall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double lenght = Double.parseDouble(scanner.nextLine());
        double weight = Double.parseDouble(scanner.nextLine());
        double wardrobeSide = Double.parseDouble(scanner.nextLine());

        double hallArea = (lenght * 100) * (weight * 100);
        double areaWardrobe = (wardrobeSide * 100) * (wardrobeSide * 100);
        double becnhArea = hallArea / 10;

        double freeSpace = hallArea - areaWardrobe - becnhArea;
        double dancers = freeSpace / (40 + 7000);

        System.out.printf("%.0f", Math.floor(dancers));

    }
}
