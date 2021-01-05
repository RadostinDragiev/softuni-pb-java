package L05_For_Loop_Lab;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < num; i++) {
            int inputNumber = Integer.parseInt(scanner.nextLine());
            if (inputNumber < min) {
                min = inputNumber;
            }
        }

        System.out.println(min);
    }
}
