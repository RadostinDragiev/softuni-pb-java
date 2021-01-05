package L04_While_Loop_Lab;

import java.util.Scanner;

public class P05MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;

        int countNumbers = 1;

        while (countNumbers <= number) {
            int n = Integer.parseInt(scanner.nextLine());
            if (n > max) {
                max = n;
            }
            countNumbers++;
        }
        System.out.println(max);

    }
}