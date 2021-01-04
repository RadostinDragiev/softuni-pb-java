package L01_Simple_Operations_And_Calculations_More_Exercises;

import java.util.Scanner;

public class P07HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double houseHeight = Double.parseDouble(scanner.nextLine());
        double houseLength = Double.parseDouble(scanner.nextLine());
        double triangleHeight = Double.parseDouble(scanner.nextLine());

        // Wall
        double wall = houseHeight * houseLength;
        double window = 1.5 * 1.5;
        double wallsArea = 2 * wall - 2 * window;
        double backWall = houseHeight * houseHeight;
        double entrance = 1.2 * 2;
        double frontAndBackWalls = 2 * backWall - entrance;
        double totalWalls = wallsArea + frontAndBackWalls;
        double greenPaint = totalWalls / 3.4;

        // Roof
        double rectanglesArea = 2 * (houseHeight * houseLength);
        double triangleArea = 2 * (houseHeight * triangleHeight / 2);
        double roofArea = rectanglesArea + triangleArea;
        double redPaint = roofArea / 4.3;

        System.out.printf("%.2f %n", greenPaint);
        System.out.printf("%.2f", redPaint);
    }
}
