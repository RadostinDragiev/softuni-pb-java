package L03_Nested_Conditional_Statements_Exercise;

import java.util.Scanner;

public class P07OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n1 = Double.parseDouble(scanner.nextLine());
        double n2 = Double.parseDouble(scanner.nextLine());
        String operator = scanner.nextLine();


        double sum = 0;
        if (operator.equals("+")) {
            sum = n1 + n2;
            boolean isTrue = sum % 2 == 0;
            if (isTrue) {
                System.out.printf("%.0f + %.0f = %.0f - even", n1, n2, sum);
            } else {
                System.out.printf("%.0f + %.0f = %.0f - odd", n1, n2, sum);
            }
        } else if (operator.equals("-")) {
            sum = n1 - n2;
            boolean isTrue = sum % 2 == 0;
            if (isTrue) {
                System.out.printf("%.0f - %.0f = %.0f - even", n1, n2, sum);
            } else {
                System.out.printf("%.0f - %.0f = %.0f - odd", n1, n2, sum);
            }
        } else if (operator.equals("*")) {
            sum = n1 * n2;
            boolean isTrue = sum % 2 == 0;
            if (isTrue) {
                System.out.printf("%.0f * %.0f = %.0f - even", n1, n2, sum);
            } else {
                System.out.printf("%.0f * %.0f = %.0f - odd", n1, n2, sum);
            }
        } else if (operator.equals("/")) {
            sum = n1 / n2;
            if (n2 == 0) {
                System.out.printf("Cannot divide %.0f by zero", n1);
            } else {
                System.out.printf("%.0f / %.0f = %.2f", n1, n2, sum);
            }
        } else if (operator.equals("%")) {
            sum = n1 % n2;
            if (n2 == 0) {
                System.out.printf("Cannot divide %.0f by zero", n1);
            } else {
                System.out.printf("%.0f %s %.0f = %.0f", n1, operator,n2, sum);
            }
        }
    }
}
