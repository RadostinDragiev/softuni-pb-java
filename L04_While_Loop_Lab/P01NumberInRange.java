package L04_While_Loop_Lab;

import java.util.Scanner;

public class P01NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        while (!(number > 0) || !(number < 101)) {
            System.out.println("Invalid number!");
            number = Integer.parseInt(scanner.nextLine());
        }
        System.out.printf("The number is: %d", number);
    }
}
