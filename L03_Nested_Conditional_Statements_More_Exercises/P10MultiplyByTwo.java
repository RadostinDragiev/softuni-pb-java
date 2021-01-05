package L03_Nested_Conditional_Statements_More_Exercises;

import java.util.Scanner;

public class P10MultiplyByTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double input = Double.parseDouble(scanner.nextLine());

        while (input >= 0) {
            input += input;
            System.out.printf("Result: %.2f%n", input);
            input = Double.parseDouble(scanner.nextLine());
        }
        System.out.println("Negative number!");
    }
}
