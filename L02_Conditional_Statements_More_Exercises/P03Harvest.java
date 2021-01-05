package L02_Conditional_Statements_More_Exercises;

import java.util.Scanner;

public class P03Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vineyardSquareMeters = Integer.parseInt(scanner.nextLine());
        double grapesPerSquareMeter = Double.parseDouble(scanner.nextLine());
        int neededWineLiters = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double kilogramsGrapes = vineyardSquareMeters * grapesPerSquareMeter;
        double kilogramsForWine = kilogramsGrapes * 0.4;
        double wineLiters = kilogramsForWine / 2.5;

        if (wineLiters < neededWineLiters) {
            double underTheNeeds = Math.abs(neededWineLiters - wineLiters);
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(underTheNeeds));
        } else if (wineLiters >= neededWineLiters) {
            double overTheNeeds = wineLiters - neededWineLiters;
            double winePerWorker = overTheNeeds / workers;
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", Math.floor(wineLiters));
            System.out.printf("%.0f liters left -> %.0f liters per person.", Math.ceil(overTheNeeds), Math.ceil(winePerWorker));
        }
    }
}
