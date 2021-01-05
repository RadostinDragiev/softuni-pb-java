package L02_Conditional_Statements_Lab;

import java.util.Scanner;

public class P04Number1To9InText {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int numberA = Integer.parseInt(scanner.nextLine());

        if (numberA == 1) {
            System.out.println("one");
        } else if (numberA == 2) {
            System.out.println("two");
        } else if (numberA == 3) {
            System.out.println("three");
        } else if (numberA == 4) {
            System.out.println("four");
        } else if (numberA == 5) {
            System.out.println("five");
        } else if (numberA == 6) {
            System.out.println("six");
        } else if (numberA == 7) {
            System.out.println("seven");
        } else if (numberA == 8) {
            System.out.println("eight");
        } else if (numberA == 9) {
            System.out.println("nine");
        } else if (numberA >= 10) {
            System.out.println("number too big");
        }
    }
}
