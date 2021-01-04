package L01_Simple_Operations_And_Calculations_More_Exercises;

import java.util.Scanner;

public class P05TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double lenght = Double.parseDouble(scanner.nextLine()) * 100;
        double width = Double.parseDouble(scanner.nextLine()) * 100;

        double minusCorridor = width - 100;

        double chairsPerRow = Math.floor(minusCorridor / 70);
        double rows = Math.floor(lenght / 120);

        double freePlaces = chairsPerRow * rows - 3;

        System.out.printf("%.0f", freePlaces);
    }
}
