package L04_While_Loop_More_Exercises;

import java.util.Scanner;

public class P05AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        double totalSum = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            totalSum += number;
        }
        System.out.printf("%.2f", totalSum / n);
    }
}
