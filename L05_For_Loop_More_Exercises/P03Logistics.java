package L05_For_Loop_More_Exercises;

import java.util.Scanner;

public class P03Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int loadCount = Integer.parseInt(scanner.nextLine());

        double priceForCargo = 0;
        double totalWeight = 0;

        double minibus = 0;
        double truck = 0;
        double train = 0;

        for (int i = 0; i < loadCount; i++) {
            int cargoWeight = Integer.parseInt(scanner.nextLine());
            totalWeight += cargoWeight;

            if (cargoWeight < 4) {
                minibus += cargoWeight;
                priceForCargo += cargoWeight * 200;
            } else if (cargoWeight < 12) {
                truck += cargoWeight;
                priceForCargo += cargoWeight * 175;
            } else {
                train += cargoWeight;
                priceForCargo += cargoWeight * 120;
            }
        }

        double minibusPercent = minibus / totalWeight * 100;
        double truckPercent = truck / totalWeight * 100;
        double trainPercent = train / totalWeight * 100;


        System.out.printf("%.2f%n", priceForCargo / totalWeight);
        System.out.printf("%.2f%%%n", minibusPercent);
        System.out.printf("%.2f%%%n", truckPercent);
        System.out.printf("%.2f%%", trainPercent);
    }
}
