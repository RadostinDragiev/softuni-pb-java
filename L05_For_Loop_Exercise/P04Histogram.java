package L05_For_Loop_Exercise;

import java.util.Scanner;

public class P04Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int incomingNumbers= Integer.parseInt(scanner.nextLine());

        double lessThan200 = 0;
        double lessThan400 = 0;
        double lessThan600 = 0;
        double lessThan800 = 0;
        double moreThan800 = 0;

        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;

        for (int i = 0; i < incomingNumbers; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number < 200) {
                p1++;
                lessThan200 = p1 / incomingNumbers * 100;
            } else if (number >= 200 && number < 400) {
                p2++;
                lessThan400 = p2 / incomingNumbers * 100;
            } else if (number >= 400 && number < 600) {
                p3++;
                lessThan600 = p3 / incomingNumbers * 100;
            } else if (number >= 600 && number < 800) {
                p4++;
                lessThan800 = p4 / incomingNumbers * 100;
            } else {
                p5++;
                moreThan800 = p5 / incomingNumbers * 100;
            }
        }

        System.out.printf("%.2f%%%n", lessThan200);
        System.out.printf("%.2f%%%n", lessThan400);
        System.out.printf("%.2f%%%n", lessThan600);
        System.out.printf("%.2f%%%n", lessThan800);
        System.out.printf("%.2f%%", moreThan800);
    }
}
