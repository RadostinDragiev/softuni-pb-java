package L03_Nested_Conditional_Statements_Lab;

import java.util.Scanner;

public class P07InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        if (number >= 100 && number <= 200 || number == 0) {

        } else {
            System.out.println("invalid");
        }
    }
}
