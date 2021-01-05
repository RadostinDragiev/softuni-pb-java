package L05_For_Loop_Lab;

import java.util.Scanner;

public class P05SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 1; i < num; i++) {
            int inputNumber = Integer.parseInt(scanner.nextLine());
            sum += inputNumber;
        }

        System.out.println(sum);
    }
}
