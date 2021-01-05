package L05_For_Loop_More_Exercises;

import java.util.Scanner;

public class P05GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int moves = Integer.parseInt(scanner.nextLine());

        double score = 0;

        double p1 = 0; // Score between 0 - 9
        double p2 = 0; // Score between 10 - 19
        double p3 = 0; // Score between 20 - 29
        double p4 = 0; // Score between 30 - 39
        double p5 = 0; // Score between 40 - 50
        double p6 = 0; // Invalid number

        for (int i = 0; i < moves; i++) {
            int currentMove = Integer.parseInt(scanner.nextLine());

            if (currentMove < 0 || currentMove > 50) {
                p6++;
                score /= 2;
            } else if (currentMove < 10) {
                p1++;
                score += currentMove * 0.20;
            } else if (currentMove < 20) {
                p2++;
                score += currentMove * 0.30;
            } else if (currentMove < 30) {
                p3++;
                score += currentMove * 0.40;
            } else if (currentMove < 40) {
                p4++;
                score += 50;
            } else if (currentMove <= 50) {
                p5++;
                score += 100;
            }
        }

        double p1Percent = p1 / moves * 100;
        double p2Percent = p2 / moves * 100;
        double p3Percent = p3 / moves * 100;
        double p4Percent = p4 / moves * 100;
        double p5Percent = p5 / moves * 100;
        double p6Percent = p6 / moves * 100;

        System.out.printf("%.2f%n", score);
        System.out.printf("From 0 to 9: %.2f%%%n", p1Percent);
        System.out.printf("From 10 to 19: %.2f%%%n", p2Percent);
        System.out.printf("From 20 to 29: %.2f%%%n", p3Percent);
        System.out.printf("From 30 to 39: %.2f%%%n", p4Percent);
        System.out.printf("From 40 to 50: %.2f%%%n", p5Percent);
        System.out.printf("Invalid numbers: %.2f%%", p6Percent);
    }
}
