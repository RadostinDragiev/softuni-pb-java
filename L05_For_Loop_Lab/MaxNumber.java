package L05_For_Loop_Lab;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int inputNumber = Integer.parseInt(scanner.nextLine());
            if (inputNumber > max) {
                max = inputNumber;
            }
        }

        System.out.println(max);
    }
}

