package L05_For_Loop_More_Exercises;

import java.util.Scanner;

public class P08EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sides = Integer.parseInt(scanner.nextLine());

        int equalSides = 0;
        int sidesSum = 0;
        int maxDiff = 0;

        int sideA;
        int sideB;
        for (int i = 0; i < sides; i++) {
            sideA = Integer.parseInt(scanner.nextLine());
            sideB = Integer.parseInt(scanner.nextLine());

            if (i >= 1) {
                if (sideA + sideB == sidesSum) {
                    equalSides++;
                    sidesSum = sideA + sideB;
                } else {
                    int difference = Math.abs((sideA + sideB) - sidesSum);
                    if (difference > maxDiff) {
                        maxDiff = difference;
                    }
                    sidesSum = sideA + sideB;
                }
            } else {
                sidesSum += sideA + sideB;
                equalSides++;
            }
        }

        if (sides == equalSides) {
            System.out.printf("Yes, value=%d", sidesSum);
        } else {
            System.out.printf("No, maxdiff=%d", maxDiff);
        }
    }
}
