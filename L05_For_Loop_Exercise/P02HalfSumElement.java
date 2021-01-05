package L05_For_Loop_Exercise;

import java.util.Scanner;

public class P02HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int maxNumber = Integer.MIN_VALUE;

        for (int i = 0; i < numbers; i++) {
            int everyNumber = Integer.parseInt(scanner.nextLine());
            sum += everyNumber;
            if (everyNumber > maxNumber) {
                maxNumber = everyNumber;
            }
        }

        if (sum - maxNumber == maxNumber) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", maxNumber);
        } else {
                System.out.println("No");
                System.out.printf("Diff = %d", Math.abs((sum- maxNumber) - maxNumber));
        }
    }
}
