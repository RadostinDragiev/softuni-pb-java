package L05_For_Loop_Lab;

import java.util.Scanner;

public class P06NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < num; i++) {
            int inputNumber = Integer.parseInt(scanner.nextLine());
            if (inputNumber > max) {
                max = inputNumber;
            }
            if (inputNumber < min) {
                min = inputNumber;
            }
        }
        System.out.printf("Max number: %d%n", max);
        System.out.printf("Min number: %d", min);
    }
}
