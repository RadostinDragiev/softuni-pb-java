package L04_While_Loop_Lab;

import java.util.Scanner;

public class P03Sequence2kPlus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        int numberPlus = 1;
        while (number >= numberPlus) {
            System.out.println(numberPlus);
            numberPlus = numberPlus * 2 + 1;
        }
    }
}
