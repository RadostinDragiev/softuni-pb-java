package L03_Nested_Conditional_Statements_Lab;

import java.util.Scanner;

public class P05NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        if (number < 100 && number > -100 && number != 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}