package L05_For_Loop_Lab;

import java.util.Scanner;

public class P07LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sides = Integer.parseInt(scanner.nextLine());
        int sumLeft = 0;
        int sumRight = 0;

        for (int i = 0; i < sides * 2 ; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (i < sides) {
                sumLeft += number;
            } else {
                sumRight += number;
            }
        }

        if (sumLeft == sumRight) {
            System.out.printf("Yes, sum = %d", sumRight);
        } else {
            System.out.printf("No, diff = %d", Math.abs(sumLeft - sumRight));
        }
    }
}
