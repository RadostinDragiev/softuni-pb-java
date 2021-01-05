package L05_For_Loop_Exercise;

import java.util.Scanner;

public class P05DivideWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = Integer.parseInt(scanner.nextLine());

        double p1 = 0;
        double p2 = 0;
        double p3 = 0;

        double p1Percent = 0;
        double p2Percent = 0;
        double p3Percent = 0;

        for (int i = 0; i < numbers; i++) {
            int incomingNumber = Integer.parseInt(scanner.nextLine());

            if (incomingNumber % 2 == 0) {
                p1++;
                p1Percent = p1 / numbers * 100;
            }
            if (incomingNumber % 3 == 0) {
                p2++;
                p2Percent = p2 / numbers * 100;
            }
            if (incomingNumber % 4 ==0){
                p3++;
                p3Percent = p3 / numbers * 100;
            }
        }

        System.out.printf("%.2f%%%n", p1Percent);
        System.out.printf("%.2f%%%n", p2Percent);
        System.out.printf("%.2f%%", p3Percent);
    }
}
